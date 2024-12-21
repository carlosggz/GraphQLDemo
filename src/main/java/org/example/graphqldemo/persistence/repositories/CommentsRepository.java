package org.example.graphqldemo.persistence.repositories;

import org.example.graphqldemo.models.Comment;
import org.example.graphqldemo.persistence.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface CommentsRepository extends JpaRepository<CommentEntity, Long> {
    @Query("select " +
            "   new org.example.graphqldemo.models.Comment(c.commentId, c.comment, m.movieId) " +
            " from MovieEntity m " +
            " left join CommentEntity c on c.movie.movieId = m.movieId")
    Stream<Comment> getWithMovie();
}
