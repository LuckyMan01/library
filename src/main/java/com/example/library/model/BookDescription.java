package com.example.library.model;

import com.example.library.util.Genre;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book_description")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BookDescription{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "title")
    private String title;

    @NonNull
    @Column(name = "author")
    private String author;

    @NonNull
    @Column(name = "genre")
    private Genre genre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "description")
    private List<Book> books;

}
