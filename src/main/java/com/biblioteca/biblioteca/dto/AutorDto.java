package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Livros;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.biblioteca.biblioteca.entity.Autor}
 */
public record AutorDto(String name, Set<Livros> livros) implements Serializable {

}