package org.example.graphqldemo.models;

import org.example.graphqldemo.persistence.entities.GenreEntity;

import java.io.Serializable;

public record Genre(long id, String name) implements Serializable {
    public static Genre fromEntity(final GenreEntity entity) {
        return new Genre(entity.getGenreId(), entity.getName());
    }
}
