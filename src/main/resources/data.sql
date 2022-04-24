insert into assistencia (nome, valor, descricao, ativo) values ('Seguro Bolsa Protegida', 13.50, 'Proteção contra roubo e furto', true);
insert into assistencia (nome, valor, descricao, ativo) values ('Seguro Celular', 19.50, 'Proteção contra roubo e furto', true);
insert into assistencia (nome, valor, descricao, ativo) values ('Seguro Odontológico', 4.99, 'Assistencia odontológica especializada', true);

insert into portador (nome, cpf, telefone, assistencia_id_assistencia, dia_faturamento, adesao_ativa) values ('Josefa Maria', '15698746531', '81999995544', 1, 18, true);
insert into portador (nome, cpf, telefone, assistencia_id_assistencia, dia_faturamento, adesao_ativa) values ('Maria Joana dos Santos', '45988741236', '83999995544', 2, 22, true);
insert into portador (nome, cpf, telefone, assistencia_id_assistencia, dia_faturamento, adesao_ativa) values ('Eduardo Maia', '63251458974', '89999995544', 3, 5, true);