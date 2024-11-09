package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
