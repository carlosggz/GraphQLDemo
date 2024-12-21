package org.example.graphqldemo.persistence.repositories;

import org.example.graphqldemo.persistence.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {
    @Query("select m from MovieEntity m " +
            " left join fetch m.genres ")
    Stream<MovieEntity> getWithGenres();
}
