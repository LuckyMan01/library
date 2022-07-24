package model;

import util.Genre;

import javax.persistence.*;

@Entity
@Table(name = "book_description")
public class BookDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name= "author")
    private String author;

    @Column(name= "genre")
    private Genre genre;

    @OneToOne
    @JoinColumn(name = "book_description_id")
    private Book book;


    public BookDescription() {
    }

    public BookDescription(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;

    }
}
