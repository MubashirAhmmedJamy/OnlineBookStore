package com.online.bookstore.OnlineBookStoreApplication.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;


    @Column(name = "password", nullable = false, length = 250)
    private String password;


    @Column(name = "name", nullable = false, length = 100)
    private String name;


    @Column(name = "created_on", nullable = false)
    private LocalDateTime created_on;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "status", columnDefinition = "boolean default true")
    private boolean status;
}
