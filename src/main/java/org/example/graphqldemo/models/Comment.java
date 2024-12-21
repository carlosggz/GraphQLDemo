package org.example.graphqldemo.models;

import java.io.Serializable;

public record Comment(long id, String comment, long movie) implements Serializable {
}
