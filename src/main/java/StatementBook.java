import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBook {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "admin1";


    private String buildStringValues(Book book) {
        return "'" +  book.getName() + "', " +
                "'" +   book.getAuthor() + "', " +
               +  book.getYears() + ", " +
                "'" +  book.getGenre() + "' , " +
                "'" +  book.getId()+"'" ;
    }
    public void create(Book book) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD)) {
            Statement statement = connection.createStatement();
            System.out.println(buildStringValues(book));
            String sql = "INSERT INTO public.books(name, author, years, genre, id) VALUES (" + buildStringValues(book) + ");";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}