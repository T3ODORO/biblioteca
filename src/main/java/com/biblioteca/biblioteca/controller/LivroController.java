package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.dto.CreateLivrosDto;
import com.biblioteca.biblioteca.dto.ReadLivrosDto;
import com.biblioteca.biblioteca.dto.UpdateLivrosDto;
import com.biblioteca.biblioteca.entity.Livros;
import com.biblioteca.biblioteca.repository.LivrosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    private LivrosRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Void> create(@RequestBody @Valid CreateLivrosDto dados) {
        repository.save(new Livros(dados));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReadLivrosDto> getLivro(@PathVariable Long id) {
        var livro = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
        return ResponseEntity.ok(new ReadLivrosDto(livro));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> update(@RequestBody @Valid UpdateLivrosDto dados) {
        var livro = repository.findById(dados.id())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
        livro.updateLivro(dados);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        var livro = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
        livro.excluir();
        return ResponseEntity.noContent().build();
    }

}
