package model;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private int phone;


    @OneToOne
    @JoinColumn(name = "user_description_id")
    private UserDescription userDescription;

    public User() {
    }

    public User(String firstName, String lastName, String email, String gender, String address, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }
}
