DROP TABLE IF EXISTS livros;

CREATE TABLE livros (
   id INTEGER PRIMARY KEY AUTO_INCREMENT,
   titulo VARCHAR(50) NOT NULL,
   descricao VARCHAR(1000),
   referencia VARCHAR(1000),
   cadastro DATE NOT NULL
   
);


INSERT INTO livros(titulo, descricao, referencia, cadastro)
VALUES ('Os cinco porquinhos', 'Historia infantil','Conto', CURRENT_DATE()),
       ('A cinderela', 'Historia infantil', 'Conto','2020-01-09');
         