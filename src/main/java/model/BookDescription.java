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

}
