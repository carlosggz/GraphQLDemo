package org.example.graphqldemo.utils;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.graphql.test.tester.HttpGraphQlTester;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseTest {

    protected HttpGraphQlTester graphQlTester;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        var client = WebTestClient.bindToServer()
                .baseUrl(String.format("http://localhost:%s/graphql", port))
                .build();

        graphQlTester = HttpGraphQlTester.create(client);
    }
}
