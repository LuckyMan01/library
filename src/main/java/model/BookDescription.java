package model;

import util.Genre;

import java.util.List;

public class BookDescription {
    private long id;
    private Book book;
    private Genre genre;
    private List<Book> numberOfCopies;
    private List<User> usersWhoRead;

}
