package com.example.library.model;

import com.example.library.repository.UserDescriptionRepository;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserDescriptionService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Entity
@Table(name= "user_description")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDescription implements UserDescriptionService {
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


    @OneToOne
    @JoinColumn(name = "user_description_id")
    private User user;


    @Autowired
    UserDescriptionRepository repository;

    @Override
    @Transactional
    public UserDescription create(UserDescription description) {
        return repository.save(description);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        UserDescription deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public UserDescription update(UserDescription description) {
        UserDescription updated = repository.getReferenceById(description.getId());
        repository.saveAndFlush(description);
        return updated;
    }

    @Override
    public UserDescription findById(Long id) {
        return repository.getReferenceById(id);
    }
}
