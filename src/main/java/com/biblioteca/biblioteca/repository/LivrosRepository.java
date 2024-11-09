package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository <Livros, Long> {
}
