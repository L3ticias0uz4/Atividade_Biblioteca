package org.example.atividade_biblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Long getId() {
        return id;
    }
    public String getCodigo() {
        return codigo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
}



