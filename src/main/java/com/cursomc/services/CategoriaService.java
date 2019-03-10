package com.cursomc.services;

import java.util.List;
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
		return opt.orElse(null) ;
	}

}
