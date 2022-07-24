package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "user_description")
public class UserDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="create_data")
    private LocalDateTime createData;

    @Column(name="active_status")
    private boolean activeStatus;

    @Column(name="last_updated_date")
    private LocalDateTime lastUpdatedDate;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserDescription() {
    }

    public UserDescription(LocalDateTime createData, boolean activeStatus, LocalDateTime lastUpdatedDate) {
        this.createData = createData;
        this.activeStatus = activeStatus;
        this.lastUpdatedDate = lastUpdatedDate;
    }

}
