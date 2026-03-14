package org.example.atividade_biblioteca.dto;

public class CarteiraResponse {

    private Long id;
    private String codigo;
    private Long usuarioId;

    public CarteiraResponse(Long id, String codigo, Long usuarioId) {
        this.id = id;
        this.codigo = codigo;
        this.usuarioId = usuarioId;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }
}