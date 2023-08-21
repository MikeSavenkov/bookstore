package com.msavenkov.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
    private Long id;
    private String name;
    private String brand;
    private Cover cover; // Enum типа обложки: твердый или мягкий переплет
    private String author;
    private Integer count;


}
