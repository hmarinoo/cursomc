package com.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.transform.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursomc.domain.Cliente;
import com.cursomc.services.ClienteService;
import com.cursomc.services.ObjectNotFoundException;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService cliService;
	
	@RequestMapping(value = "/{id}",method =RequestMethod.GET)
	public ResponseEntity<Cliente> findById(@PathVariable Integer id) {
		Cliente cli = cliService.findById(id);
		return ResponseEntity.ok().body(cli);		
	}
	
}
