package com.snappay.useraccess.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "active")
    private int active;

    public User(User users) {
        this.id = users.getId();
        this.email = users.getEmail();
        this.firstName = users.getFirstName();
        this.lastName = users.getLastName();
        this.userName = users.getUserName();
        this.password = users.getPassword();
        this.active = users.getActive();
    }
}
