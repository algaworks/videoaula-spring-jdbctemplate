create table usuario (
  id bigint not null auto_increment,
  nome varchar(100) not null,
  email varchar(100),
  primary key(id)
) engine=InnoDB;

insert into usuario (id, nome, email) values (1, 'Ana Ragozone', 'ana.testes@algaworks.com');
insert into usuario (id, nome, email) values (2, 'Anna Paula', 'anna.testes@algaworks.com');
insert into usuario (id, nome, email) values (3, 'Thiago', 'thiago.testes@algaworks.com');
insert into usuario (id, nome, email) values (4, 'Alexandre', 'alexandre.testes@algaworks.com');
