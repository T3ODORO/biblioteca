package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Tipo;
import com.biblioteca.biblioteca.entity.Usuario;

public record ReadUsuarioDto(String nome, String senha, Tipo tipo) {
    public ReadUsuarioDto(Usuario usuario) {
        this(usuario.getNome(), usuario.getSenha(), usuario.getTipo());
    }
}
