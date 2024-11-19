package com.biblioteca.biblioteca.entity;

import com.biblioteca.biblioteca.dto.CreateUsuarioDto;
import com.biblioteca.biblioteca.dto.UpdateUsuariosDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {
    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String senha;
    private Tipo tipo;
    private Boolean ativo;

    public Usuario (CreateUsuarioDto dados) {
        this.nome = dados.nome();
        this.senha = dados.senha();
        this.tipo = dados.tipo();
        this.ativo = dados.ativo();
    }

    public void atualizar (UpdateUsuariosDto dados) {
        if (dados.id() != null) {
            this.id = dados.id();
        }
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.senha() != null) {
            this.senha = dados.senha();
        }
        if (dados.tipo() != null) {
            this.tipo = dados.tipo();
        }
    }

    public void excluir() {
        this.ativo = false;
    }

}
