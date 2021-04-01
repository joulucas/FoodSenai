CREATE DATABASE senaiFood;

CREATE TABLE cliente(
	codigo  int PRIMARY key  GENERATED ALWAYS AS identity,
	nome VARCHAR ( 50 ) NOT NULL,
	endereco VARCHAR ( 50 ) NOT NULL,
);

insert into cliente 
values (1, 'joao', 'ituiutaba');

insert into cliente 
values (2, 'maria', 'ituiutaba');

insert into cliente 
values (3, 'tiao', 'uberlandia');