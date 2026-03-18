package org.example.atividade_biblioteca.repositories;
import org.example.atividade_biblioteca.entities.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}