package model;

import util.Genre;

import java.util.List;

public class BookDescription {
    private long id;
    private Genre genre;
    private Book book;
    private List<Book> numberOfCopies;
    private List<User> usersWhoRead;

}
