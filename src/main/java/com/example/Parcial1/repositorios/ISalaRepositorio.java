package com.example.Parcial1.repositorios;

import com.example.Parcial1.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Integer> {

    Optional<Sala> finByNombre(String nombre);
    List<Sala> findByTipoSala(String tipoSala);
}
