package com.example.library.model;

import lombok.*;
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


}
