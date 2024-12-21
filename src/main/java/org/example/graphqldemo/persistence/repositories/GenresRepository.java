package org.example.graphqldemo.persistence.repositories;

import org.example.graphqldemo.persistence.entities.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<GenreEntity, Long> {
}
