package org.example.atividade_biblioteca.dto;

public class EmprestimoResponse {

    private Long id;
    private String livro;
    private Long usuarioId;

    public EmprestimoResponse(Long id, String livro, Long usuarioId) {
        this.id = id;
        this.livro = livro;
        this.usuarioId = usuarioId;
    }
}