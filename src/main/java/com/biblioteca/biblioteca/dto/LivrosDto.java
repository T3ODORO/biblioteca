package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Autor;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.biblioteca.biblioteca.entity.Livros}
 */
public record LivrosDto(String titulo, String isbn, Boolean disponibilidade, EditoraDto editora,
                        Set<Autor> autores) implements Serializable {
}