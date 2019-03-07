package com.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method =RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Escritório");		
		List<Categoria> categorias = Arrays.asList(categoria1,categoria2);
		System.out.println(categoria1);
		System.out.println(categoria2);
		
		return categorias;
	}
}
