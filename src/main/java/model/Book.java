package model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_book")
    private String nameBook;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "is_user")
    private boolean isUser;

    @Column(name="create_data")
    private LocalDateTime createData;

    @Column(name="last_update_date")
    private LocalDateTime lastUpdateDate;

    @Column(name = "expiration_id")
    private LocalDateTime expirationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private BookDescription bookDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_description")
    private UserDescription userDescription;

    public Book() {
    }

    public Book(String nameBook, UUID uuid, boolean isUser, LocalDateTime createData, LocalDateTime lastUpdateDate, LocalDateTime expirationId) {
        this.nameBook = nameBook;
        this.uuid = uuid;
        this.isUser = isUser;
        this.createData = createData;
        this.lastUpdateDate = lastUpdateDate;
        this.expirationId = expirationId;
    }
}
