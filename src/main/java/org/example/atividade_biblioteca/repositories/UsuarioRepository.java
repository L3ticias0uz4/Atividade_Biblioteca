package org.example.atividade_biblioteca.repositories;

import org.example.atividade_biblioteca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}