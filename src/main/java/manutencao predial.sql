CREATE DATABASE ManutencaoPredial;
GO

USE ManutencaoPredial;
GO

CREATE TABLE usuarios (
    id_usuario INT IDENTITY (1,1)PRIMARY KEY,
	email VARCHAR(100) UNIQUE NOT NULL,
	senha VARCHAR(255) NOT NULL,
    nome VARCHAR(100) NOT NULL,
	cpf CHAR(11) UNIQUE NOT NULL,
	data_nascimento DATE 
);


CREATE TABLE eletrica (
    id INT IDENTITY(1,1) PRIMARY KEY,
    manutencao BIT NULL,
    instalacao BIT NULL,
    ferramentas VARCHAR(255) NOT NULL,
    data VARCHAR(10) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao TEXT NULL
);

CREATE TABLE ferramentas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ferramentas VARCHAR(255) NOT NULL,
    data VARCHAR(10) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao TEXT NULL
);

CREATE TABLE hidraulica (
    id INT IDENTITY(1,1) PRIMARY KEY,
    manutencao BIT NULL,
    instalacao BIT NULL,
    ferramentas VARCHAR(255) NOT NULL,
    data VARCHAR(10) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao TEXT NULL
);

CREATE TABLE materiais (
    id INT IDENTITY(1,1) PRIMARY KEY,
    quantidades INT NOT NULL,
    data VARCHAR(10) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao TEXT NULL
);

CREATE TABLE pintura (
    id INT IDENTITY(1,1) PRIMARY KEY,
    pintura BIT NULL,
    retoque BIT NULL,
    data VARCHAR(10) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    descricao TEXT NULL
);


USE ManutencaoPredial;
GO

-- Criando a tabela projeto_residencial
CREATE TABLE projeto_residencial (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_inicio VARCHAR(10) NOT NULL,
    data_fim VARCHAR(10) NULL,
    descricao TEXT NULL
);
GO

-- Adicionando chave estrangeira à tabela eletrica
ALTER TABLE eletrica 
ADD projeto_id INT,
FOREIGN KEY (projeto_id) REFERENCES projeto_residencial(id);
GO

-- Adicionando chave estrangeira à tabela hidraulica
ALTER TABLE hidraulica 
ADD projeto_id INT,
FOREIGN KEY (projeto_id) REFERENCES projeto_residencial(id);
GO

-- Adicionando chave estrangeira à tabela ferramentas
ALTER TABLE ferramentas 
ADD projeto_id INT,
FOREIGN KEY (projeto_id) REFERENCES projeto_residencial(id);
GO

-- Adicionando chave estrangeira à tabela materiais
ALTER TABLE materiais 
ADD projeto_id INT,
FOREIGN KEY (projeto_id) REFERENCES projeto_residencial(id);
GO

-- Adicionando chave estrangeira à tabela pintura
ALTER TABLE pintura 
ADD projeto_id INT,
FOREIGN KEY (projeto_id) REFERENCES projeto_residencial(id);
GO

select * from eletrica;
select * from Usuarios;
select * from hidraulica;
select * from ferramentas;
select * from materiais;
select * from pintura;
select * from projeto_residencial;
drop table Usuarios;


-- Adicionando chave estrangeira em eletrica
ALTER TABLE eletrica 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);

-- Adicionando chave estrangeira em hidraulica
ALTER TABLE hidraulica 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);

-- Adicionando chave estrangeira em ferramentas
ALTER TABLE ferramentas 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);

-- Adicionando chave estrangeira em materiais
ALTER TABLE materiais 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);

-- Adicionando chave estrangeira em pintura
ALTER TABLE pintura 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);

-- Adicionando chave estrangeira em projeto_residencial
ALTER TABLE projeto_residencial 
ADD id_usuario INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);
