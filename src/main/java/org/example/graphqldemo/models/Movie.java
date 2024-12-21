package org.example.graphqldemo.models;

import org.example.graphqldemo.persistence.entities.MovieEntity;

import java.io.Serializable;
import java.util.List;

public record Movie(long id, String title, int year, List<Genre> genres) implements Serializable {

    public static Movie fromEntity(final MovieEntity entity) {
        return new Movie(
                entity.getMovieId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGenres().stream().map(Genre::fromEntity).toList());
    }
}
