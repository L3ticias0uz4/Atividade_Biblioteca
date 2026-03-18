package org.example.atividade_biblioteca.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String livro;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setLivro(String livro) {
    }

    public void setData(LocalDate now) {
    }

    public void setUsuario(Usuario usuario) {

    }
}