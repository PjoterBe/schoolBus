drop schema public cascade;
drop table user if exists;
create table user(
user_id INTEGER NOT NULL PRIMARY KEY,
user_name VARCHAR(100),
user_surname VARCHAR(100),
user_paassword VARCHAR(100),
user_email VARCHAR(100),
join_date VARCHAR(100)
);
drop table follower if exists;
create table follower (
follower_id INTEGER NOT NULL PRIMARY KEY,
follower_name VARCHAR(100),
follower_surname VARCHAR(100),
follower_email VARCHAR(100),
start_following VARCHAR(100)
);
drop table post if exists;
create table post (
post_id INTEGER NOT NULL PRIMARY KEY,
creator_name VARCHAR(100),
creator_surname VARCHAR(100),
creator_email VARCHAR(100),
time_of_cration VARCHAR(100),
post_content VARCHAR(200),
);