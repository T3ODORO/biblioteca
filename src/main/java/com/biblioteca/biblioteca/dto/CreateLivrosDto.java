package com.biblioteca.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

public record CreateLivrosDto(
        @NotBlank String titulo,
        @NotBlank String isbn,
        @NotNull Boolean disponibilidade,
        @NotNull Boolean ativo,
        @NotNull String editora,
        @NotNull String autores) {
}
