package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Tipo;

public record CreateUsuarioDto(String nome, String senha, Tipo tipo, Boolean ativo) {
}
