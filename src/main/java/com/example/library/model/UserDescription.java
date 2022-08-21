package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "user_description")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name="create_data")
    private LocalDateTime createData;

    @NonNull
    @Column(name="active_status")
    private boolean activeStatus;

    @NonNull
    @Column(name="last_updated_date")
    private LocalDateTime lastUpdatedDate;

}
