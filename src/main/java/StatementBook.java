import model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBook {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "admin1";


    private String buildStringValues(Book book) {
        return "'"+book.getNameBook() + " '" + "'"+book.getYears()+"'" +  "'" + book.getAuthor() + "'";

    }

    public void create(Book book) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD)) {
            Statement statement = connection.createStatement();
            System.out.println(buildStringValues(book));
            String sql = "INSERT INTO public.book(name_book,years,author) VALUES ("+"'" +book.getNameBook()+"', " + book.getYears()+",'" + book.getAuthor()+"'" +  ");";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
