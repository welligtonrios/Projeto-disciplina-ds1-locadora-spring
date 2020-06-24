package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Categoria;
import com.example.demo.repositorys.CategoriaResopitory;

@SpringBootApplication
public class ProjetoDisciplinaDs1LocadoraSpringApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaResopitory categoriaResopitory;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoDisciplinaDs1LocadoraSpringApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Ficção");
		Categoria cat2 = new Categoria(null, "Ação");
		
		

		
		categoriaResopitory.saveAll(Arrays.asList(cat1,cat2)  );
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
