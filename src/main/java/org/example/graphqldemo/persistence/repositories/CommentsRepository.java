package org.example.graphqldemo.persistence.repositories;

import org.example.graphqldemo.persistence.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<CommentEntity, Long> {
}
