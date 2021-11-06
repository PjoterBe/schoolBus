drop schema public cascade;
drop table user if exists;
create table user(
user_id INTEGER NOT NULL PRIMARY KEY,
user_name VARCHAR(100),
user_surname VARCHAR(100),
user_paassword VARCHAR(100),
email VARCHAR(100),
join_date TIMESTAMP
);
drop table follower if exists;
create table follower (
follower_id INTEGER NOT NULL PRIMARY KEY,
follower_name VARCHAR(100),
follower_surname VARCHAR(100),
email VARCHAR(100),
start_following TIMESTAMP,
stop_following TIMESTAMP,
is_checked BIT
);
drop table post if exists;
create table post (
post_id INTEGER NOT NULL PRIMARY KEY,
creator_name VARCHAR(100),
creator_surname VARCHAR(100),
creator_email VARCHAR(100),
time_of_cration TIMESTAMP,
does_exist BIT
);