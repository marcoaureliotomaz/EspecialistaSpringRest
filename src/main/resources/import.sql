insert into algafood.tab_cozinhas (id, nom_cozinha) values (1,'Tailandesa');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (2,'Indiana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (3,'Mexicana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (4,'Italiana');
insert into algafood.tab_cozinhas (id, nom_cozinha) values (5,'Brasileira');

insert into algafood.formapagamento (id, descricao) values (1,'DINHEIRO');
insert into algafood.formapagamento (id, descricao) values (2,'CARTÃO');

insert into algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (1,'Tchê', 5,1);
insert into algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (2,'Braseiro',4, 2);
insert into algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (3,'Gauchinha',3, 3);
insert into algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (4,'Germanos',3, 5);


insert into algafood.permissao (id, descricao) values (1,'Consulta');
insert into algafood.permissao (id, descricao) values (2,'Insert');
insert into algafood.permissao (id, descricao) values (3,'Update');
insert into algafood.permissao (id, descricao) values (4,'Delete');

insert into algafood.estado (id, nome) values (1,'CE');
insert into algafood.estado (id, nome) values (2,'SP');
insert into algafood.estado (id, nome) values (3,'RN');
insert into algafood.estado (id, nome) values (4,'ES');
insert into algafood.estado (id, nome) values (5,'PB');
insert into algafood.estado (id, nome) values (6,'PE');

insert into algafood.cidade (id, nome, estado_id) values (1,'Campos Sales',1);
insert into algafood.cidade (id, nome, estado_id) values (2,'Santos',2);
insert into algafood.cidade (id, nome, estado_id) values (3,'Mossoró',3);
insert into algafood.cidade (id, nome, estado_id) values (4,'Natal',3);
insert into algafood.cidade (id, nome, estado_id) values (5,'São Mateus',4);
insert into algafood.cidade (id, nome, estado_id) values (6,'Campina Grande',5);
insert into algafood.cidade (id, nome, estado_id) values (7,'Recife',6);

insert into algafood.restaurante_forma_pagamento  values (1,1);
insert into algafood.restaurante_forma_pagamento  values (1,2);
insert into algafood.restaurante_forma_pagamento  values (2,2);
insert into algafood.restaurante_forma_pagamento  values (3,2);
insert into algafood.restaurante_forma_pagamento  values (4,2);





