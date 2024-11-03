package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "editoras")
public class Editora implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "editora", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Livros> livros = new HashSet<>();

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Livros> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livros> livros) {
        this.livros = livros;
    }
}
