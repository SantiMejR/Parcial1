package com.example.Parcial1.repositorios;

import com.example.Parcial1.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeliculaRepositorio extends JpaRepository<Pelicula, Integer> {

    List<Pelicula> findByTitulo(String titulo);
    List<Pelicula> findByDirector(String director);
}
