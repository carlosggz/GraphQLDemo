package org.example.graphqldemo.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.graphqldemo.models.Movie;
import org.example.graphqldemo.models.filters.MoviesFilter;
import org.example.graphqldemo.persistence.entities.MovieEntity;
import org.example.graphqldemo.persistence.repositories.MoviesRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class MoviesService {
    private final MoviesRepository moviesRepository;

    @Transactional
    public List<Movie> getMovies(long offset, long limit, MoviesFilter filter) {
        var stream = moviesRepository.getWithGenres();

        if (Objects.nonNull(filter)) {
            stream = stream
                    .filter(hasId(filter.getId()))
                    .filter(hasTitle(filter.getTitle()))
                    .filter(inYear(filter.getYear()));
        }

        return stream
                .skip(offset)
                .limit(limit)
                .map(Movie::fromEntity)
                .toList();
    }

    private Predicate<MovieEntity> hasId(Long id) {
        return x -> Objects.isNull(id) || Objects.equals(x.getMovieId(), id);
    }

    private Predicate<MovieEntity> hasTitle(String title) {
        return x -> !StringUtils.hasLength(title) || x.getTitle().contains(title);
    }

    private Predicate<MovieEntity> inYear(Integer year) {
        return x -> Objects.isNull(year) || Objects.equals(x.getYear(), year);
    }
}
