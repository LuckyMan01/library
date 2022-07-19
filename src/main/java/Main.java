import model.Book;
import model.BookDescription;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import util.Genre;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Book.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        try {

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save("");
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
