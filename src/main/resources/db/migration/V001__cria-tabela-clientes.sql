create table cliente (
	id bigint not null auto_increment PRIMARY KEY,
    nome varchar(60) not null,
    email varchar(60) not null,
    telefone varchar(11)
)