package com.biblioteca.biblioteca.entity;

import com.biblioteca.biblioteca.dto.CreateLivrosDto;
import com.biblioteca.biblioteca.dto.UpdateLivrosDto;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livros implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String isbn;

    private Boolean disponibilidade;

    private Boolean ativo;

    private String editora;

    private String autores;



    public Livros(CreateLivrosDto dados) {
        this.titulo = dados.titulo();
        this.isbn = dados.isbn();
        this.disponibilidade = dados.disponibilidade();
        this.ativo = dados.ativo();
        this.editora = dados.editora();
        this.autores = dados.autores();
    }

    public void updateLivro(UpdateLivrosDto dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.isbn() != null){
            this.isbn = dados.isbn();
        }
        if(dados.disponibilidade() != null){
            this.disponibilidade = dados.disponibilidade();
        }
        if(dados.editora() != null){
            this.editora = dados.editora();
        }
        if(dados.autores() != null){
            this.autores = dados.autores();
        }

}

    public void excluir() {
        this.ativo = false;
    }
}
