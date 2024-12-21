package org.example.graphqldemo.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.graphqldemo.models.Comment;
import org.example.graphqldemo.models.filters.CommentsFilter;
import org.example.graphqldemo.persistence.repositories.CommentsRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class CommentsService {
    private final CommentsRepository commentsRepository;

    @Transactional
    public List<Comment> comments(long offset, long limit, CommentsFilter filter) {
        var stream = commentsRepository.getWithMovie();

        if (Objects.nonNull(filter)) {
            stream = stream
                    .filter(hasId(filter.getId()))
                    .filter(hasContent(filter.getComment()))
                    .filter(belongsToMovie(filter.getMovie()));
        }

        return stream
                .skip(offset)
                .limit(limit)
                .toList();
    }

    private Predicate<Comment> hasId(Long id) {
        return x -> Objects.isNull(id) || Objects.equals(x.id(), id);
    }

    private Predicate<Comment> hasContent(String content) {
        return x -> !StringUtils.hasLength(content) || x.comment().contains(content);
    }

    private Predicate<Comment> belongsToMovie(Long movie) {
        return x -> Objects.isNull(movie) || Objects.equals(x.movie(), movie);
    }
}
