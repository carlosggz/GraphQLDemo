package org.example.graphqldemo.models.filters;

import lombok.Data;

@Data
public class MoviesFilter {
    private Long id;
    private String title;
    private Integer year;
}
