DROP TABLE IF EXISTS livros;

CREATE TABLE livros(
		id INT PRIMARY KEY AUTO_INCREMENT,
		nome VARCHAR (50) NOT NULL,
		descricao VARCHAR (50) NOT NULL,
		quantity INT NOT NULL,
		referencia INT NOT NULL,
		registration DATE NOT NULL,

);
INSERT INTO livros (nome, descricao, quantity, referencia, registration)
VALUES ('A culpa e das estrelas', 'romance', 10, 2010, CURRENTE_DATE()),
	   ('Como eu era antes de voce', 'romance', 10, 2009, CURRENTE_DATE()),
	   ('Barba azul', 'conto', 10, 1990, CURRENTE_DATE()),
	   ('A o alfaiate valente', 'conto', 10, 2001, CURRENTE_DATE());

