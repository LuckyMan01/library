import model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Book.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        try {
            Book book = new Book("Onix", 1993, "jon");
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
