import model.Book;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Book.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
