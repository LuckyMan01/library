package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User  {

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

}
