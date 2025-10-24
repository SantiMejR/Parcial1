package com.example.Parcial1.repositorios;

import com.example.Parcial1.modelos.Pelicula;
import com.example.Parcial1.modelos.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPerfilRepositorio extends JpaRepository<Perfil, Integer> {

    Optional<Perfil> findByDireccion(String direccion);
    List<Perfil> findByCiudad(String ciudad);
}
