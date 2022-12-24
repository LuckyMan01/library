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
    @Column(name = "instance_id")
    private String instanceId;

    @NonNull
    @Column(name = "is_used")
    private boolean isUsed;

    @NonNull
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @NonNull
    @Column(name = "last_updated_data")
    private LocalDateTime lastUpdatedDate;

    @NonNull
    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_description_id")
    private BookDescription description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_cart_id")
    private Client client;

}
