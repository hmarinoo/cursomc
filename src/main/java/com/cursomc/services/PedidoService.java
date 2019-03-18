package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Pedido;
import com.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedRep;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> opt = pedRep.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado")); 
	}

}
