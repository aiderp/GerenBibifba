package edu.ifba.gerenbibifba.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
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
	Optional<Livro> l = repository.findById(id);
		return l.isPresent() ? l.get() : null;
	}

	@Override
	public List<Livro> findALL() {
		return repository. findAll(Sort.by("cadastro").descending());
	}

	
	}


