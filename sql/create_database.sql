drop table if exists account_role;
drop table if exists role;
drop table if exists account;
drop table if exists registration;

create table registration (
    id int unsigned not null auto_increment primary key,
    username varchar(50) unique not null,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(50) not null,
    city varchar(50) not null,
    contact_phone varchar(50) not null,
    contact_name varchar(50) not null,
    travel_arranger varchar(50),
    company varchar(50),
    ada varchar(200),
    br_session1 boolean,
    br_session2 boolean,
    br_session3 boolean,
    br_session4 boolean,
    br_session5 boolean,
    br_session6 boolean,
    br_session7 boolean,
    br_session8 boolean,
    br_session9 boolean,
    br_session10 boolean,
    date_created timestamp default 0,
    date_modified timestamp default current_timestamp on update current_timestamp,
    unique index registration_idx_1 (username),
    unique index registration_idx_2 (email)
) engine = InnoDb;

create table account (
    id int unsigned not null auto_increment primary key,
    username varchar(50) unique not null,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(50) not null,
    password varchar(64), -- varchar(64) to accommodate SHA-256 hashes
    marketing_ok boolean not null,
    accept_terms boolean not null,
    enabled boolean not null,
    date_created timestamp default 0,
    date_modified timestamp default current_timestamp on update current_timestamp,
    unique index account_idx_1 (username),
    unique index account_idx_2 (email)
) engine = InnoDb;

create table role (
    id tinyint unsigned not null auto_increment primary key,
    name varchar(50) not null unique
) engine = InnoDb;

create table account_role (
    id int unsigned not null auto_increment primary key,
    account_id int unsigned not null,
    role_id tinyint unsigned not null,
    foreign key (account_id) references account (id),
    foreign key (role_id) references role(id),
    unique index account_role_idx_1 (account_id, role_id)
) engine = InnoDb;

insert into registration values
    (1, 'juan', 'Juan', 'Cazares', 'juan.cazares@example.com', 'Seattle', '7777777777', 'contactName', 'travelArranger', 'Milliman', 'ada',1,1,1,1,1,1,1,1,1,1,null, null),
    (2, 'elvira', 'Elvira', 'Cazares', 'elvira.cazares@example.com', 'San Diego', '7777777777', 'contactName', 'travelArranger', 'Milliman', 'ada',1,1,1,1,1,1,1,1,1,1,null, null),
    (3, 'julia', 'Julia', 'Cazares', 'julia.cazares@example.com', 'NY', '7777777777', 'contactName', 'travelArranger', 'Milliman', 'ada',1,1,1,1,1,1,1,1,1,1,null, null);


    


insert into account values
    (1, 'juan', 'Juan', 'Cazares', 'juan.cazares@example.com', 'p@ssword', 1, 1, 1, null, null),
    (2, 'elvira', 'Elvira', 'Cazares', 'elvira.cazares@example.com', 'p@ssword', 1, 1, 1, null, null),
    (3, 'julia', 'Julia', 'Cazares', 'julia.cazares@example.com', 'p@ssword', 1, 1, 1, null, null),
    (4, 'daniel', 'Daniel', 'Cazares', 'daniel.cazares@example.com', 'p@ssword', 1, 1, 1, null, null),
    (5, 'paula', 'Paula', 'Cazares', 'paula.cazares@example.com', 'p@ssword', 1, 1, 1, null, null);

insert into role values
    (1, 'user'),
    (2, 'admin');

insert into account_role values
    (0, 1, 1),
    (0, 1, 2),
    (0, 2, 1),
    (0, 3, 1),
    (0, 4, 1),
    (0, 5, 1);
