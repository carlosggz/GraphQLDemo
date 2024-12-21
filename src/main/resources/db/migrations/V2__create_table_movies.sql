create table movies
(
    movie_id serial constraint movies_pk  primary key,
    title    varchar(100) not null,
    release_year     integer      not null
);


INSERT INTO movies (movie_id, title, release_year) VALUES (1, 'The Godfather', 1972);
INSERT INTO movies (movie_id, title, release_year) VALUES (2, 'The Dark Knight', 2008);
INSERT INTO movies (movie_id, title, release_year) VALUES (3, 'Forrest Gump', 1994);
INSERT INTO movies (movie_id, title, release_year) VALUES (4, 'Pulp Fiction', 1994);
INSERT INTO movies (movie_id, title, release_year) VALUES (5, 'Schindler''s List', 1993);
INSERT INTO movies (movie_id, title, release_year) VALUES (6, 'The Matrix', 1999);
INSERT INTO movies (movie_id, title, release_year) VALUES (7, 'The Lord of the Rings: The Fellowship of the Ring', 2001);
INSERT INTO movies (movie_id, title, release_year) VALUES (8, 'Gladiator', 2000);
INSERT INTO movies (movie_id, title, release_year) VALUES (9, 'Titanic', 1997);
INSERT INTO movies (movie_id, title, release_year) VALUES (10, 'Avengers: Endgame', 2019);
INSERT INTO movies (movie_id, title, release_year) VALUES (11, 'The Return of the King', 2003);
INSERT INTO movies (movie_id, title, release_year) VALUES (12, 'Star Wars: Episode IV - A New Hope', 1977);
INSERT INTO movies (movie_id, title, release_year) VALUES (13, 'Django Unchained', 2012);
INSERT INTO movies (movie_id, title, release_year) VALUES (14, 'The Shining', 1980);
INSERT INTO movies (movie_id, title, release_year) VALUES (15, 'Inception', 2010);
INSERT INTO movies (movie_id, title, release_year) VALUES (16, 'The Silence of the Lambs', 1991);
INSERT INTO movies (movie_id, title, release_year) VALUES (17, 'Interstellar', 2014);
INSERT INTO movies (movie_id, title, release_year) VALUES (18, 'Whiplash', 2014);
INSERT INTO movies (movie_id, title, release_year) VALUES (19, 'Coco', 2017);
INSERT INTO movies (movie_id, title, release_year) VALUES (20, 'Toy Story', 1995);
