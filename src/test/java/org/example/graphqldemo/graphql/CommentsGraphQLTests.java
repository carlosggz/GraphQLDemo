package org.example.graphqldemo.graphql;

import jakarta.transaction.Transactional;
import lombok.SneakyThrows;
import lombok.val;
import org.example.graphqldemo.models.Comment;
import org.example.graphqldemo.persistence.repositories.CommentsRepository;
import org.example.graphqldemo.utils.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class CommentsGraphQLTests extends BaseTest {
    private static final String COMMENTS_QUERY = """
            {
              comments(filter: {
                comment: "first"
              }, offset: 1, limit: 5){
                id
                comment
                movie
              }
            }
            """;

    @Autowired
    private CommentsRepository commentsRepository;

    @Test
    @SneakyThrows
    @Transactional
    void getCommentsReturnsTheListOfComments() {

        val comments = graphQlTester
                .document(COMMENTS_QUERY)
                .execute()
                .path("data.comments")
                .entityList(Comment.class)
                .get();

        assertNotNull(comments);
        assertEquals(5, comments.size());

        IntStream
                .of(2,3,4,5,6)
                .forEach(id -> {
                    var model = comments.stream().filter(x -> x.id() == id).findFirst();
                    assertTrue(model.isPresent());
                    var entity = commentsRepository
                            .getWithMovie()
                            .filter(x -> x.id() == id)
                            .findFirst()
                            .orElseThrow();
                    assertEquals(model.get(), entity);
                });

    }
}
