package org.example.graphqldemo.persistence.repositories;

import org.example.graphqldemo.persistence.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {
}
