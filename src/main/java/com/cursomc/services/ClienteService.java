package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Cliente;
import com.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository catRep;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> opt = catRep.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado")); 
	}

}
