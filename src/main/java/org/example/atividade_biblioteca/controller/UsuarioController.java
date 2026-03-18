package org.example.atividade_biblioteca.controller;

import org.example.atividade_biblioteca.dto.UsuarioRequest;
import org.example.atividade_biblioteca.dto.UsuarioResponse;
import org.example.atividade_biblioteca.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioResponse criar(@RequestBody UsuarioRequest request){
        return service.criar(request);
    }

    @GetMapping
    public List<UsuarioResponse> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public UsuarioResponse buscar(@PathVariable Long id){
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public UsuarioResponse atualizar(@PathVariable Long id,
                                     @RequestBody UsuarioRequest request){
        return service.atualizar(id, request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}