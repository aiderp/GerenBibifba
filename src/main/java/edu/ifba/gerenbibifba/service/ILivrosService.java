package edu.ifba.gerenbibifba.service;

import java.util.List;

import edu.ifba.gerenbibifba.model.Livro;

public interface ILivrosService {

	void save(Livro l);
	
	void delete(Integer id);
	
	Livro find(Integer id);
	
	
	List <Livro>findALL();

	
	
	
	
	
	
	
	
}
