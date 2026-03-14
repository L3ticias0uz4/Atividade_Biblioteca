package org.example.atividade_biblioteca.controller;

import org.example.atividade_biblioteca.dto.CarteiraRequest;
import org.example.atividade_biblioteca.dto.CarteiraResponse;
import org.example.atividade_biblioteca.service.CarteiraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carteiras")
public class CarteiraController {

    private final CarteiraService service;

    public CarteiraController(CarteiraService service) {
        this.service = service;
    }

    @PostMapping("/{usuarioId}")
    public CarteiraResponse criar(@PathVariable Long usuarioId,
                                  @RequestBody CarteiraRequest request){

        return service.criar(usuarioId, request);
    }
}