package org.example.graphqldemo.graphql;

import jakarta.transaction.Transactional;
import lombok.SneakyThrows;
import lombok.val;
import org.example.graphqldemo.models.Movie;
import org.example.graphqldemo.persistence.repositories.MoviesRepository;
import org.example.graphqldemo.utils.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesGraphQLTests extends BaseTest {

    private static final String MOVIES_QUERY = """
            {
              movies(filter: {
                title: "The"
              }, offset: 3, limit: 3) {
                id
                title
                year
                genres {
                  id
                  name
                }
              }
            }
            """;

    @Autowired
    private MoviesRepository moviesRepository;

    @Test
    @SneakyThrows
    @Transactional
    void getMoviesReturnsTheListOfMovies() {

        val movies = graphQlTester
                .document(MOVIES_QUERY)
                .execute()
                .path("data.movies")
                .entityList(Movie.class)
                .get();

        assertNotNull(movies);
        assertEquals(3, movies.size());

        IntStream
                .of(7,11,14)
                .forEach(id -> {
                    var model = movies.stream().filter(x -> x.id() == id).findFirst();
                    assertTrue(model.isPresent());
                    var entity = moviesRepository
                            .getWithGenres()
                            .filter(x -> x.getMovieId() == id)
                            .findFirst()
                            .map(Movie::fromEntity)
                            .orElseThrow();
                    assertEquals(model.get(), entity);
                });

    }
}
