package com.example.library.model;

import com.example.library.repository.BookDescriptionRepository;
import com.example.library.service.BookDescriptionService;
import com.example.library.util.Genre;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "book_description")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BookDescription implements BookDescriptionService {
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

    @OneToOne
    @JoinColumn(name = "book_description_id")
    private Book book;

    @Autowired
    private BookDescriptionRepository repository;

    @Override
    @Transactional
    public BookDescription create(BookDescription entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        BookDescription deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public BookDescription update(BookDescription entity) {
        BookDescription updated = repository.getReferenceById(entity.getId());
        repository.saveAndFlush(entity);
        return updated;
    }

    @Override
    public BookDescription findById(Long id) {
        return repository.getReferenceById(id);
    }
}
