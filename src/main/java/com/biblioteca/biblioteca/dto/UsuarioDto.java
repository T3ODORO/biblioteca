package com.biblioteca.biblioteca.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.biblioteca.biblioteca.entity.Usuario}
 */
public record UsuarioDto(String nome, String senha) implements Serializable {
}