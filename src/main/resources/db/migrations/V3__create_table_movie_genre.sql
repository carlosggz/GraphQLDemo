create table movie_genre
(
    movie_id integer not null constraint fk_movie_genre_movie references movies,
    genre_id integer not null  constraint fk_movie_genre_genre references genres,
    constraint movie_genre_pk primary key (movie_id, genre_id)
);

INSERT INTO movie_genre (movie_id, genre_id) VALUES (1, 1);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (1, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (2, 1);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (2, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (2, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (3, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (3, 4);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (4, 1);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (4, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (5, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (5, 5);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (5, 6);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (6, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (6, 7);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (7, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (7, 9);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (8, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (8, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (8, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (9, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (9, 4);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (10, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (10, 7);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (10, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (11, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (11, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (11, 9);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (12, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (12, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (12, 9);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (13, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (13, 10);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (14, 11);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (14, 12);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (15, 3);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (15, 7);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (15, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (16, 1);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (16, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (16, 12);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (17, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (17, 7);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (17, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (18, 2);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (18, 13);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (19, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (19, 14);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (19, 15);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (20, 8);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (20, 15);
INSERT INTO movie_genre (movie_id, genre_id) VALUES (20, 16);
