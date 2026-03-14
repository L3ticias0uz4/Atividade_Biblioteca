package org.example.atividade_biblioteca.service;

import org.example.atividade_biblioteca.dto.UsuarioRequest;
import org.example.atividade_biblioteca.dto.UsuarioResponse;
import org.example.atividade_biblioteca.entities.Usuario;
import org.example.atividade_biblioteca.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioResponse criar(UsuarioRequest request) {

        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());

        repository.save(usuario);

        return new UsuarioResponse(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

    public List<UsuarioResponse> listar() {

        return repository.findAll().stream()
                .map(u -> new UsuarioResponse(u.getId(), u.getNome(), u.getEmail()))
                .collect(Collectors.toList());
    }

    public UsuarioResponse buscar(Long id) {

        Usuario u = repository.findById(id).orElseThrow();

        return new UsuarioResponse(u.getId(), u.getNome(), u.getEmail());
    }

    public UsuarioResponse atualizar(Long id, UsuarioRequest request) {

        Usuario u = repository.findById(id).orElseThrow();

        u.setNome(request.getNome());
        u.setEmail(request.getEmail());

        repository.save(u);

        return new UsuarioResponse(u.getId(), u.getNome(), u.getEmail());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}