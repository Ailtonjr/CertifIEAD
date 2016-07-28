/*	*
	*	IEAD Camboriú - Igreja Evangélica Assembléia de Deus Camboriú
	*	Autor:	-	Ailton Cardoso Júnior
	*	
	*	Projeto: Sistema de emissao de certificados para a IEAD Camboriú
	*	   Nome: CertifIEAD
	*	
	*/	

	
 -- DDL		Data Definition Language

CREATE TABLE usuario (
	id SERIAL,
	nome VARCHAR(255)	NOT NULL,
	login VARCHAR(255)	NOT NULL UNIQUE,
	senha VARCHAR(255)	NOT NULL
);

CREATE TABLE certificado (
	id SERIAL,
	impresso BOOLEAN			NOT NULL,
	data_impressao date 		NOT NULL,
	data_apresentacao date 		NOT NULL,
	nome VARCHAR(255)			NOT NULL,
	cidade VARCHAR(255)			NOT NULL,
	estado VARCHAR(255)			NOT NULL,
	data_nasc date				NOT NULL,
	nome_pai VARCHAR(255) 		NOT NULL,
	nome_mae VARCHAR(255) 		NOT NULL,
	cartorio VARCHAR(255) 		NOT NULL,
	num_cartorio INTEGER 		NOT NULL,
	folha_cartorio VARCHAR(255) NOT NULL,
	livro_cartorio VARCHAR(255) NOT NULL,
	num_igreja INTEGER		 	NOT NULL,
	livro_igreja VARCHAR(255) 	NOT NULL,
	id_apresentador INTEGER 	NOT NULL
);

CREATE TABLE apresentador(
	id SERIAL,
	nome VARCHAR(255) 			NOT NULL
);


ALTER TABLE usuario ADD PRIMARY KEY (id);
ALTER TABLE certificado ADD PRIMARY KEY (id);
ALTER TABLE apresentador ADD PRIMARY KEY (id);

ALTER TABLE certificado ADD FOREIGN KEY (id_apresentador) REFERENCES apresentador(id) ON DELETE SET NULL;
