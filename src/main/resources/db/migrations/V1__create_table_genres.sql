create table genres
(
    genre_id serial constraint genre_pk primary key,
    name     varchar(50) not null
);

create unique index genre_name_index on genres (name);


INSERT INTO genres (genre_id, name) VALUES (1, 'Crime');
INSERT INTO genres (genre_id, name) VALUES (2, 'Drama');
INSERT INTO genres (genre_id, name) VALUES (3, 'Action');
INSERT INTO genres (genre_id, name) VALUES (4, 'Romance');
INSERT INTO genres (genre_id, name) VALUES (5, 'Biography');
INSERT INTO genres (genre_id, name) VALUES (6, 'History');
INSERT INTO genres (genre_id, name) VALUES (7, 'Sci-Fi');
INSERT INTO genres (genre_id, name) VALUES (8, 'Adventure');
INSERT INTO genres (genre_id, name) VALUES (9, 'Fantasy');
INSERT INTO genres (genre_id, name) VALUES (10, 'Western');
INSERT INTO genres (genre_id, name) VALUES (11, 'Horror');
INSERT INTO genres (genre_id, name) VALUES (12, 'Thriller');
INSERT INTO genres (genre_id, name) VALUES (13, 'Music');
INSERT INTO genres (genre_id, name) VALUES (14, 'Family');
INSERT INTO genres (genre_id, name) VALUES (15, 'Animation');
INSERT INTO genres (genre_id, name) VALUES (16, 'Comedy');
