package com.example.demo.resouces.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.service.exceptions.ObjectNotFoundException;


/*
 * *controlar as exceptions dentro dos nossos controladores
 */
@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class) // essa classe está na camada service
	public ResponseEntity<StandardError>ObjectNotFoundException(ObjectNotFoundException e, 
			HttpServletRequest request){
		 
	StandardError erro = new  StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	
	
	
}
