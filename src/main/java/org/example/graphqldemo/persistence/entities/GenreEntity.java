package org.example.graphqldemo.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "genres")
public class GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long genreId;

    @Column(length = 50, nullable = false )
    private String name;

    @ManyToMany(mappedBy = "genres")
    private List<MovieEntity> movies;
}
