 CREATE TABLE competencias (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL
);

CREATE TABLE candidatos (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  sobrenome VARCHAR(45) NOT NULL,
  data_de_nascimento VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  senha VARCHAR(20) NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  pais VARCHAR(45) NOT NULL,
  cep VARCHAR(45) NOT NULL,
  descricao VARCHAR(220) NOT NULL
);

CREATE TABLE empresas (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  cnpj VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  senha VARCHAR(20) NOT NULL,
  descricao VARCHAR(220) NOT NULL,
  pais VARCHAR(45) NOT NULL,
  cep VARCHAR(45) NOT NULL
);

CREATE TABLE vagas (
  id SERIAL NOT NULL PRIMARY KEY,
  nome VARCHAR(45) NOT NULL,
  descricao VARCHAR(45) NOT NULL,
  lugar VARCHAR(45) NOT NULL,
  id_empresas INT REFERENCES empresas(id) NOT NULL
);

CREATE TABLE candidatos_has_competencias (
    id SERIAL NOT NULL PRIMARY KEY,
    candidatos_id INT REFERENCES candidatos(id) NOT NULL,
    competencias_id INT REFERENCES competencias(id)  NOT NULL
);

CREATE TABLE empresas_has_competencias (
    id SERIAL NOT NULL PRIMARY KEY,
    empresas_id INT REFERENCES empresas(id) NOT NULL,
    competencias_id INT REFERENCES competencias(id)  NOT NULL
);
CREATE TABLE candidatos_has_vagas (
    id SERIAL NOT NULL PRIMARY KEY,
    candidatos_id INT REFERENCES candidatos(id) NOT NULL,
    vagas_id INT REFERENCES vagas(id)  NOT NULL
);


INSERT INTO competencias(nome) VALUES ('React');
INSERT INTO competencias(nome) VALUES ('Javascript');
INSERT INTO competencias(nome) VALUES ('Java'); 
INSERT INTO competencias(nome) VALUES ('C++'); 
INSERT INTO competencias(nome) VALUES ('Kotlin');
INSERT INTO competencias(nome) VALUES ('Bash');
INSERT INTO competencias(nome) VALUES ('CSS');
INSERT INTO competencias(nome) VALUES ('Groovy');
INSERT INTO competencias(nome) VALUES ('HTML');
INSERT INTO competencias(nome) VALUES ('PHP'); 
INSERT INTO competencias(nome) VALUES ('Angular'); 
INSERT INTO competencias(nome) VALUES ('PostgreeSQL');
INSERT INTO competencias(nome) VALUES ('C'); 
INSERT INTO competencias(nome) VALUES ('PYTHON');

INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, senha, cpf, pais, cep, descricao) VALUES
('Joao','Canuto','2000-09-07','joao@gmail.com','1234567','123.456.789-99','Brasil','12345-67','Estudante de Ciência da Computação buscando estágio na area de DEV-FrontEnd');
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, senha, cpf, pais, cep, descricao) VALUES
('Luis','Branco','1980-10-26','luis@hotmail.com','1234567','123.456.789-99','Brasil','12345-67','Estudante de Engenharia de Software');
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, senha, cpf, pais, cep, descricao) VALUES
('Pereira','Monteiro','1999-11-15','pereirinha26@yahoo.com.br','1234567','123.456.789-99','Brasil','12345-67','Estudante de Matemática voltada para Computação');
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, senha, cpf, pais, cep, descricao) VALUES
('Vitor','Carneiro','2003-01-07','vitinho07@yahoo.com.br','1234567','123.456.789-99','Brasil','12345-67','Estudante de Engenharia Eletrica voltada para Computação');
INSERT INTO candidatos(nome, sobrenome, data_de_nascimento, email, senha, cpf, pais, cep, descricao) VALUES
('Ellen','Soares','2001-07-22','ellenbb@yahoo.com.br','1234567','123.456.789-99','Brasil','12345-67','Estudante de Engenharia Civil voltada para Computação');


INSERT INTO empresas(nome,email,senha,cnpj,pais,cep, descricao) VALUES
('DNP', 'dnpoffice@dnpoffice.com', '1234567', '12.345.678/9999-99', 'Brasil', '12345-67', 'Devs FrontEnd para desenvolver um loja online de Fotografia');
INSERT INTO empresas(nome,email,senha,cnpj,pais,cep, descricao) VALUES
('Diferencial', 'diferencialasj@asj.net', '1234567', '12.345.678/9999-99', 'Brasil', '12345-67', 'Dev Backend para desenvolver um sistema de Projetos de Refrigeração de Ambientes');
INSERT INTO empresas(nome,email,senha,cnpj,pais,cep, descricao) VALUES
('ZG', 'zgcompany@zg.com', '1234567', '12.345.678/9999-99', 'Brasil', '12345-67', 'Dev Full stack para Desenvolver softwares para hospitais');
INSERT INTO empresas(nome,email,senha,cnpj,pais,cep, descricao) VALUES
('GaulesCC', 'gaulesacessoria@gaules.com', '1234567', '12.345.678/9999-99', 'Brasil', '12345-67', 'Devs Back End para o site nacional de Stream');
INSERT INTO empresas(nome,email,senha,cnpj,pais,cep, descricao) VALUES
('Verde', 'verdao@vvv.com', '1234567', '12.345.678/9999-99', 'Brasil', '12345-67', 'Procuramos devs Front End para site de vendas de produtos oficiais do Palmeiras');

INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (1, 1);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (1, 2);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (1, 7);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (1, 9);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (1, 11);

INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (2, 3);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (2, 4);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (2, 8);

INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 1);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 2);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 7);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 9);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 11);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 4);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (3, 8);

INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (4, 1);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (4, 2);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (4, 8);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (4, 7);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (4, 9);

INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (5, 1);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (5, 2);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (5, 7);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (5, 9);
INSERT INTO empresas_has_competencias(empresas_id,competencias_id) VALUES (5, 11);

--

INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (1, 1);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (1, 2);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (1, 7);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (1, 9);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (1, 11);

INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (2, 3);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (2, 4);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (2, 8);

INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 1);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 2);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 7);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 9);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 11);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 4);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (3, 8);

INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (4, 1);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (4, 2);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (4, 8);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (4, 7);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (4, 9);

INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (5, 1);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (5, 2);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (5, 7);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (5, 9);
INSERT INTO candidatos_has_competencias(candidatos_id,competencias_id) VALUES (5, 11);