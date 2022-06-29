package model;

public class Book {
    private long id;
    private String nameBook;
    private int years;
    private String author;
    private BookDescription bookDescription;

    public String getNameBook() {
        return nameBook;
    }

    public int getYears() {
        return years;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String nameBook, int years, String author) {
        this.nameBook = nameBook;
        this.years = years;
        this.author = author;
    }
}
