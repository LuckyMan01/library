package model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_book")
    private String nameBook;

    @Column(name = "years")
    private int years;

    @Column(name = "author")
    private String author;

    @OneToOne
    @JoinColumn(name = "book_id")
    private BookDescription bookDescription;

    public Book() {
    }

    public Book(String nameBook, int years, String author) {
        this.nameBook = nameBook;
        this.years = years;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYears() {
        return years;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", years=" + years +
                ", author='" + author + '\'' +
                ", bookDescription=" + bookDescription +
                '}';
    }
}
