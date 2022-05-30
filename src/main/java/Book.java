import java.util.UUID;

public class Book {
    private String name;
    private int years;
    private String genre;
    private String author;
    private UUID id;

    public Book() {

    }

    public Book(String name, String author, String genre, int years) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.years = years;
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public UUID getId() {
        return id;
    }

    private UUID generateId() {
        return UUID.randomUUID();
    }
}
