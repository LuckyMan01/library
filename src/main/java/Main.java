public class Main {
    public static void main(String[] args) {
        StatementBook statement = new StatementBook();
        Book book = new Book("Algoritmgg", "Anna_Braun", "camedi", 1994);
        statement.create(book);
        Admin admin = new Admin();
    }
}
