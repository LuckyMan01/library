package model;

import javax.persistence.*;
import util.Genre;

@Entity
@Table(name = "book_description")
public class BookDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;

    @Column(name= "genre")
    private Genre genre;

    @OneToOne
    @JoinColumn(name = "book_description_id")
    private Book book;


    public BookDescription() {
    }

    public BookDescription(long id, Genre genre) {
        this.id = id;
        this.genre = genre;
    }
}
