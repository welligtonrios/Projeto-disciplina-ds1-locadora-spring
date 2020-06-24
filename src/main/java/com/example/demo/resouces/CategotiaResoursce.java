package com.example.demo.resouces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategotiaResoursce {
	
	@GetMapping
	public String listar() {
		return "Rest Olá mundo";
	}
	
	
	
	
	
	
	
}
