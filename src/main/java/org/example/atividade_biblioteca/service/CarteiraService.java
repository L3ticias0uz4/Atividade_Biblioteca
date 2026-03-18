package org.example.atividade_biblioteca.service;

import org.example.atividade_biblioteca.dto.CarteiraRequest;
import org.example.atividade_biblioteca.dto.CarteiraResponse;
import org.example.atividade_biblioteca.entities.Carteira;
import org.example.atividade_biblioteca.entities.Usuario;
import org.example.atividade_biblioteca.repositories.CarteiraRepository;
import org.example.atividade_biblioteca.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class CarteiraService {

    private final CarteiraRepository carteiraRepository;
    private final UsuarioRepository usuarioRepository;

    public CarteiraService(CarteiraRepository carteiraRepository,
                           UsuarioRepository usuarioRepository) {
        this.carteiraRepository = carteiraRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public CarteiraResponse criar(Long usuarioId, CarteiraRequest request){

        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow();

        Carteira carteira = new Carteira();
        carteira.setCodigo(request.getCodigo());
        carteira.setUsuario(usuario);

        carteiraRepository.save(carteira);

        return new CarteiraResponse(
                carteira.getId(),
                carteira.getCodigo(),
                usuario.getId()
        );
    }
}