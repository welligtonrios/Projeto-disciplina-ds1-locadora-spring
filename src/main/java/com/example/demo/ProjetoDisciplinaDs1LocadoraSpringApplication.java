package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.Filme;
import com.example.demo.repositorys.CategoriaRepository;
import com.example.demo.repositorys.FilmeRepository;


@SpringBootApplication
public class ProjetoDisciplinaDs1LocadoraSpringApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	FilmeRepository filmeRepository ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoDisciplinaDs1LocadoraSpringApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Ficção"); 
		Categoria cat2 = new Categoria(null, "Ação");
		
		Filme f1 = new Filme(null,"Matrix",5.00);
		Filme f2 = new Filme(null,"Django",6.00);
		Filme f3 = new Filme(null,"Trinit",7.00);
		
		/*adicionar o filme a categoria*/
		cat1.getFilmes().addAll(Arrays.asList(f1));
		cat2.getFilmes().addAll(Arrays.asList(f2,f3));
		
		/*adicionar categoria ao filme*/
		f1.getCategorias().addAll(Arrays.asList(cat1));
		f2.getCategorias().addAll(Arrays.asList(cat2));
		f3.getCategorias().addAll(Arrays.asList(cat2));


		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		filmeRepository.saveAll(Arrays.asList(f1,f2,f3));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
