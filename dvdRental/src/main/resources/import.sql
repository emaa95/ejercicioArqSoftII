-- You can use this file to load seed data into the database using SQL statements
insert into FILM (name) values ('Salta');
insert into FILM (name) values ('Córdoba');

insert into MEMBER (name, last_name, email) values ('Jose Maria', 'Quiroga', 'jmquiroga@hotmail.com');

insert into ADDRESS (address_type, number, street, state_id, user_id) values (3, 2015, 'Independencia', 2, 1);