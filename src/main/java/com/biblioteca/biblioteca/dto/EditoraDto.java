package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Livros;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.biblioteca.biblioteca.entity.Editora}
 */
public record EditoraDto(String nome, Set<Livros> livros) implements Serializable {
}