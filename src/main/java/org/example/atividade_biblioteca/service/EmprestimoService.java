package org.example.atividade_biblioteca.service;

import org.example.atividade_biblioteca.dto.EmprestimoRequest;
import org.example.atividade_biblioteca.entities.Emprestimo;
import org.example.atividade_biblioteca.entities.Usuario;
import org.example.atividade_biblioteca.repositories.EmprestimoRepository;
import org.example.atividade_biblioteca.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final UsuarioRepository usuarioRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository,
                             UsuarioRepository usuarioRepository) {
        this.emprestimoRepository = emprestimoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Emprestimo criar(Long usuarioId, EmprestimoRequest request){

        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow();

        Emprestimo e = new Emprestimo();
        e.setLivro(request.getLivro());
        e.setData(LocalDate.now());
        e.setUsuario(usuario);

        return emprestimoRepository.save(e);
    }

    public List<Emprestimo> listarPorUsuario(Long usuarioId){
        return emprestimoRepository.findByUsuarioId(usuarioId);
    }
}