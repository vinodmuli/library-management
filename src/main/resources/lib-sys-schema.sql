

drop table if exists issue_book; 
drop table if exists Usr; 
drop table if exists Book; 

create table Usr(
id varchar(32) not null,
login varchar(32) not null,
first_name varchar(32) not null,
last_name varchar(32),
email_id varchar(64) not null,
create_ts timestamp,
Constraint usr_pk primary key(id),
Constraint usr_uk1 unique(login),
Constraint usr_uk2 unique(email_id)
);

create table Book(
id varchar(32) not null,
title varchar(32) not null,
author varchar(32) not null,
quantity int,
create_ts timestamp,
Constraint book_pk primary key(id)
);

create table issue_book(
id varchar(32) not null,
usr_id varchar(32) not null,
book_id varchar(32) not null,
issue_date timestamp,
submit_date timestamp,
Constraint issue_book_pk primary key(id),
Constraint issue_book_fk1 foreign key(usr_id) references usr(id),
Constraint issue_book_fk2 foreign key(book_id) references book(id)
);