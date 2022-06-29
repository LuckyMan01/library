import model.Book;

public class Main {
    public static void main(String[] args) {
        StatementBook statementBook = new StatementBook();
        Book book = new Book("book1",1996,"Hugo");
        statementBook.create(book);
    }
}
