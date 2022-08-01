package com.example.library.model;

import com.example.library.repository.BookRepository;
import com.example.library.service.BookService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "book")
public class Book implements BookService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "name_book")
    private String nameBook;

    @NonNull
    @Column(name = "uuid")
    private UUID uuid;

    @NonNull
    @Column(name = "is_user")
    private boolean isUser;

    @NonNull
    @Column(name = "create_data")
    private LocalDateTime createData;

    @NonNull
    @Column(name = "last_update_date")
    private LocalDateTime lastUpdateDate;

    @NonNull
    @Column(name = "expiration_id")
    private LocalDateTime expirationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private BookDescription bookDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User user;

    @Autowired
    private BookRepository repository;

    @Override
    @Transactional
    public Book create(Book entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        Book deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public Book update(Book entity) {
        Book updated = repository.getReferenceById(entity.getId());
        repository.saveAndFlush(entity);
        return updated;
    }

    @Override
    public Book findById(Long id) {
        return repository.getReferenceById(id);
    }

}
