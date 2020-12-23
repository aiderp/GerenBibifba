package edu.ifba.gerenbibifba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;

import edu.ifba.gerenbibifba.model.Livro;
import edu.ifba.gerenbibifba.repository.ILivrosRepository;
import edu.ifba.gerenbibifba.service.ILivrosService;

@Service
public class LivroService implements ILivrosService {

	@Autowired
	private ILivrosRepository repository;
	
	@Override
	public void save(Livro l) {
		repository.save(l);
		
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public Livro find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livro> fidALL() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	}


