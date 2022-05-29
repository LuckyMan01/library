import java.util.LinkedList;

public class Library {
    private int size;
    private final String libraryName;
    private LinkedList<Book> bookList = new LinkedList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public int size() {
        return this.size;
    }

    private boolean isAddBook(Book books) {
        return true;

    }

    private boolean isRemoveBook(Book nameBook) {
        return true;
    }

    private boolean isRemoveBook(int nameBook) {
        return true;

    }

    public Book getBook(){
        return new Book();
    }


}
