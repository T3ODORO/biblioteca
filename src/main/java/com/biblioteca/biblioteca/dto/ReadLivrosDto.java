package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.entity.Livros;

import java.util.Set;

public record ReadLivrosDto(Long id, String titulo, String isbn, Boolean disponibilidade, Boolean ativo, String editora,
                            String autores) {

    public ReadLivrosDto(Livros livro) {
        this(livro.getId(), livro.getTitulo(), livro.getIsbn(), livro.getDisponibilidade(),
                livro.getAtivo(), livro.getEditora(), livro.getAutores());
    }
}
