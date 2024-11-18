package com.biblioteca.biblioteca.dto;

import java.io.Serializable;
import java.util.Set;

public record UpdateLivrosDto(Long id, String titulo, String isbn, Boolean disponibilidade, Boolean ativo, String editora,
                              String autores) implements Serializable {
}
