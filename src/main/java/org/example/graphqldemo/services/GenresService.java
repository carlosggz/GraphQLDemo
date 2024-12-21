package org.example.graphqldemo.services;

import lombok.RequiredArgsConstructor;
import org.example.graphqldemo.models.Genre;
import org.example.graphqldemo.persistence.repositories.GenresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenresService {
    private final GenresRepository genresRepository;

    public List<Genre> genres() {
        return genresRepository
                .findAll()
                .stream()
                .map(Genre::fromEntity)
                .toList();
    }
}
