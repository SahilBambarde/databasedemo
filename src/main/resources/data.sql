create table person(
    id integer not null,
    name varchar(200) not null,
    location varchar(200),
    birth_date timestamp,
    primary key(id)
);

insert into person(id, name, location, birth_date) values(10001,'Ranga','Hyderabad',CURRENT_TIMESTAMP +1);
insert into person(id, name, location, birth_date) values(10002,'James','York',CURRENT_TIMESTAMP+2);
insert into person(id, name, location, birth_date) values(10003,'Peter','Mumbai',CURRENT_TIMESTAMP+3);