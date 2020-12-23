package edu.ifba.gerenbibifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifba.gerenbibifba.model.Livro;

public interface ILivrosRepository 
extends JpaRepository<Livro, Integer>{

}
