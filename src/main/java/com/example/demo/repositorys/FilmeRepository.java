package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {

}
