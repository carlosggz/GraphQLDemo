package org.example.graphqldemo.graphql;

import lombok.SneakyThrows;
import lombok.val;
import org.example.graphqldemo.models.Genre;
import org.example.graphqldemo.utils.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GenresGraphQLTests extends BaseTest {
    private static final String GENRES_QUERY = """
            {
              genres {
                id
                name
              }
            }
            """;

    @Test
    @SneakyThrows
    void getGenresReturnsTheListOfGenres() {

        val genres = graphQlTester
                .document(GENRES_QUERY)
                .execute()
                .path("data.genres")
                .entityList(Genre.class)
                .get();

        assertNotNull(genres);
        assertEquals(16, genres.size());
    }
}
