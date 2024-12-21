package org.example.graphqldemo.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie_comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(nullable = false, length = 100)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id", nullable=false)
    private MovieEntity movie;
}
