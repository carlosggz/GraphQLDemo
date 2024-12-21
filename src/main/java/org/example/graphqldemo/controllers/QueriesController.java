package org.example.graphqldemo.controllers;

import lombok.RequiredArgsConstructor;
import org.example.graphqldemo.models.Comment;
import org.example.graphqldemo.models.Genre;
import org.example.graphqldemo.models.Movie;
import org.example.graphqldemo.models.filters.CommentsFilter;
import org.example.graphqldemo.models.filters.MoviesFilter;
import org.example.graphqldemo.services.CommentsService;
import org.example.graphqldemo.services.GenresService;
import org.example.graphqldemo.services.MoviesService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QueriesController {
    private final MoviesService moviesService;
    private final GenresService genresService;
    private final CommentsService commentsService;

    @QueryMapping
    public List<Movie> movies(@Argument long offset, @Argument long limit, @Argument MoviesFilter filter) {
        return moviesService.getMovies(offset, limit, filter);
    }

    @QueryMapping
    public List<Genre> genres() {
        return genresService.genres();
    }

    @QueryMapping
    public List<Comment> comments(@Argument long offset, @Argument long limit, @Argument CommentsFilter filter) {
        return commentsService.comments(offset, limit, filter);
    }
}
