import java.rmi.server.UID;
import java.util.HashSet;
import java.util.UUID;

public class Library {
    private int size;
    private HashSet<Book> bookList = new HashSet<>();

    protected void AddBook(Book book) {
        bookList.add(book);
    }

    protected void RemoveBook(Book nameBook) {
        for (Book i : bookList) {
            if (i.getName().equals(nameBook.getName())) {
                bookList.remove(i);
            } else {
                System.out.println("book not found");
            }
        }
    }

    protected void RemoveBook(UUID idBook) {
        for (Book i : bookList) {
            if (i.getId() == idBook) {
                bookList.remove(i);
            } else {
                System.out.println("book not found");
            }
        }
    }

    public Book getBook() {
        return new Book();
    }

    public int size() {
        return this.size;
    }
}
