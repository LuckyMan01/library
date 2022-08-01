package com.example.library.model;


import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements UserService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @NonNull
    @Column(name = "first_name")
    private String firstName;
    @NonNull
    @Column(name = "last_name")
    private String lastName;
    @NonNull
    @Column(name = "email")
    private String email;
    @NonNull
    @Column(name = "gender")
    private String gender;
    @NonNull
    @Column(name = "address")
    private String address;
    @NonNull
    @Column(name = "phone")
    private int phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User user;

    @Autowired
    UserRepository repository;

    @Override
    @Transactional
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        User deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public User update(User user) {
        User updated = repository.getReferenceById(user.getId());
        repository.saveAndFlush(user);
        return updated;
    }

    @Override
    public User findById(Long id) {
        return repository.getReferenceById(id);
    }
}
