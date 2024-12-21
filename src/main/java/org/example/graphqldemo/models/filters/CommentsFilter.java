package org.example.graphqldemo.models.filters;

import lombok.Data;

@Data
public class CommentsFilter {
    private Long id;
    private String comment;
    private Long movie;
}
