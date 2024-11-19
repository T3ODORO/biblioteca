package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Tipo;

public record UpdateUsuariosDto(Long id, String nome, String senha, Tipo tipo) {
}
