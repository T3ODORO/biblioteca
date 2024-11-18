package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Long> {
}

