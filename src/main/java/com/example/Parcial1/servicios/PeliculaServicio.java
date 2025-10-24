package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.DTO.PeliculaDTO;
import com.example.Parcial1.modelos.Pelicula;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.modelos.mapas.IPeliculaMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import com.example.Parcial1.repositorios.IPeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PeliculaServicio {

    @Autowired
    private IPeliculaRepositorio repositorio;

    @Autowired
    private IPeliculaMapa mapa;

    public PeliculaDTO guardarPelicula(Pelicula datosPelicula){


        Pelicula peliculaQueGuardoElRepo=this.repositorio.save(datosPelicula);
        if(peliculaQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar la pelicula en la base de datos"
            );

        }

        return this.mapa.convertir_pelicula_a_dtopelicula(peliculaQueGuardoElRepo);
    }
}
