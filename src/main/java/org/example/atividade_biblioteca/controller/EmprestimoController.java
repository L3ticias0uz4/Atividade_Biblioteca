package org.example.atividade_biblioteca.controller;

import org.example.atividade_biblioteca.dto.EmprestimoRequest;
import org.example.atividade_biblioteca.entities.Emprestimo;
import org.example.atividade_biblioteca.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }

    @PostMapping("/{usuarioId}")
    public Emprestimo criar(@PathVariable Long usuarioId,
                            @RequestBody EmprestimoRequest request){
        return service.criar(usuarioId, request);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Emprestimo> listar(@PathVariable Long usuarioId){
        return service.listarPorUsuario(usuarioId);
    }
}