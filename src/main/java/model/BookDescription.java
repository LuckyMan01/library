package model;

import jakarta.persistence.*;
import util.Genre;

import java.util.List;

@Entity
@Table(name = "book_description")
public class BookDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;

    @Column(name= "genre")
    private Genre genre;

    private List<Book> numberOfCopies;
    private List<User> usersWhoRead;

    public BookDescription() {
    }

    public BookDescription(long id, Genre genre, List<Book> numberOfCopies, List<User> usersWhoRead) {
        this.id = id;
        this.genre = genre;
        this.numberOfCopies = numberOfCopies;
        this.usersWhoRead = usersWhoRead;
    }
}
