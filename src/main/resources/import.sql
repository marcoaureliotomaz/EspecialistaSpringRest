insert into algafood.tab_cozinhas (id, nom_cozinha) values (1,'Tailandesa');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (2,'Indiana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (3,'Mexicana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (4,'Italiana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (5,'Brasileira');

insert into algafood.formapagamento (id, descricao) values (1,'DINHEIRO');
insert into algafood.formapagamento (id, descricao) values (2,'CARTÃO');

insert into algafood.restaurante (nome, taxa_frete, cozinha_id, formapagamento_id) values ('Tchê', 5,1,2);
insert into algafood.restaurante (nome, taxa_frete, cozinha_id, formapagamento_id) values ('Braseiro',4, 2,2);
insert into algafood.restaurante (nome, taxa_frete, cozinha_id, formapagamento_id) values ('Gauchinha',3, 3,1);
insert into algafood.restaurante (nome, taxa_frete, cozinha_id, formapagamento_id) values ('Gauchinha',3, 5,2);


insert into algafood.permissao (id, descricao) values (1,'Consulta');
insert into algafood.permissao (id, descricao) values (2,'Insert');
insert into algafood.permissao (id, descricao) values (3,'Update');
insert into algafood.permissao (id, descricao) values (4,'Delete');



