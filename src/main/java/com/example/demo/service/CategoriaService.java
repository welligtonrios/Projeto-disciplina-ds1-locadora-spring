package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositorys.CategoriaRepository;
import com.example.demo.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired /*cria uma instancia dessa class*/
	private CategoriaRepository repository;
	
	public Categoria find(Integer id) { //quando buscar categoria
		
		Optional<Categoria> obj = repository.findById(id); // ele retorna um objeto encapsulado em Optional 
		// que vai me permitir retorna o objeto ou lançar o orElse... com a exceção 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "
																	+ id + " Tipo: " + Categoria.class.getName()));
	}
	

}