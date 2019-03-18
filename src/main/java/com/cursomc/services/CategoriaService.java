package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catRep;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> opt = catRep.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado")); 
	}

	public Categoria insert(Categoria categoria) {
		categoria.setId(null);
		return catRep.save(categoria);
	}

	public Categoria update(Categoria categoria) {
		findById(categoria.getId());
		return catRep.save(categoria);
	}

}
