create table movie_comment
(
    comment_id serial constraint movie_comment_pk primary key,
    movie_id   integer not null  constraint fk_movie_comment references movies,
    comment    varchar(100) not null
);

create index movie_comment_movie_id_index on movie_comment (movie_id);

INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (1, 1, 'first comment for movie 1');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (2, 2, 'first comment for movie 2');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (3, 3, 'first comment for movie 3');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (4, 4, 'first comment for movie 4');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (5, 5, 'first comment for movie 5');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (6, 6, 'first comment for movie 6');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (7, 7, 'first comment for movie 7');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (8, 8, 'first comment for movie 8');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (9, 9, 'first comment for movie 9');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (10, 10, 'first comment for movie 10');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (11, 11, 'first comment for movie 11');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (12, 12, 'first comment for movie 12');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (13, 13, 'first comment for movie 13');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (14, 14, 'first comment for movie 14');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (15, 15, 'first comment for movie 15');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (16, 16, 'first comment for movie 16');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (17, 17, 'first comment for movie 17');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (18, 18, 'first comment for movie 18');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (19, 19, 'first comment for movie 19');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (20, 20, 'first comment for movie 20');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (21, 1, 'second comment for movie 1');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (22, 2, 'second comment for movie 2');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (23, 3, 'second comment for movie 3');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (24, 4, 'second comment for movie 4');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (25, 5, 'second comment for movie 5');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (26, 6, 'second comment for movie 6');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (27, 7, 'second comment for movie 7');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (28, 8, 'second comment for movie 8');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (29, 9, 'second comment for movie 9');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (30, 10, 'second comment for movie 10');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (31, 11, 'second comment for movie 11');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (32, 12, 'second comment for movie 12');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (33, 13, 'second comment for movie 13');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (34, 14, 'second comment for movie 14');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (35, 15, 'second comment for movie 15');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (36, 16, 'second comment for movie 16');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (37, 17, 'second comment for movie 17');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (38, 18, 'second comment for movie 18');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (39, 19, 'second comment for movie 19');
INSERT INTO movie_comment (comment_id, movie_id, comment) VALUES (40, 20, 'second comment for movie 20');
