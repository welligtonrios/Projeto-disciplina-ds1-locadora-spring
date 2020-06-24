package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Categoria;

public interface CategoriaResopitory extends JpaRepository<Categoria, Integer> {

}
