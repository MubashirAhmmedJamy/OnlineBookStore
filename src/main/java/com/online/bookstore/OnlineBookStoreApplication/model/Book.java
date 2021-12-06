package com.online.bookstore.OnlineBookStoreApplication.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false,length = 255)
    private String title;

    @Column(name = "author", nullable = false,length = 255)
    private String author;

    @Column(name = "description", nullable = false,length = 500)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "createdOn")
    private LocalDateTime createdOn;

    @Column(name = "status", columnDefinition = "boolean default true")
    private boolean status;
}