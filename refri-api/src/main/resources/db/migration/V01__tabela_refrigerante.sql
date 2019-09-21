CREATE TABLE REFRIGERANTE (

id bigint auto_increment not null,
marca varchar(30) not null,
litragem varchar(10) not null,
tipo varchar(30) not null,
sabor varchar(30) not null,
quantidade bigint not null,
valor decimal(10,2),

primary key (id)

); 