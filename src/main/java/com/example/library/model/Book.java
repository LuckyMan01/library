package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "name_book")
    private String nameBook;

    @NonNull
    @Column(name = "number_uuid")
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_description_id")
    private BookDescription description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_users_id")
    private User user;

}
