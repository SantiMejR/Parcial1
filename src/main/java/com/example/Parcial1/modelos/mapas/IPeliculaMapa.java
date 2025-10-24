package com.example.Parcial1.modelos.mapas;

import com.example.Parcial1.modelos.DTO.PeliculaDTO;
import com.example.Parcial1.modelos.Pelicula;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPeliculaMapa {

    @Mapping(source = "titulo", target = "titulo")
    @Mapping(source = "duracionMin", target = "duracionMin")
    @Mapping(source = "director", target = "director")
    @Mapping(source = "anoEstreno", target = "anoEstreno")
    @Mapping(source = "clasificacionPelicula", target = "clasificacionPelicula")
    PeliculaDTO convertir_pelicula_a_dtopelicula(Pelicula pelicula);

    List<PeliculaDTO> convertir_lista_a_listadtopelicula(List<Pelicula> lista);
}
