package com.example.Parcial1.modelos.mapas;

import com.example.Parcial1.modelos.DTO.PeliculaDTO;
import com.example.Parcial1.modelos.DTO.PerfilDTO;
import com.example.Parcial1.modelos.Pelicula;
import com.example.Parcial1.modelos.Perfil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPerfilMapa {

    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "telefonoAlterno", target = "telefonoAlterno")
    @Mapping(source = "estadoCivil", target = "estadoCivil")
    @Mapping(source = "ocupacion", target = "ocupacion")
    PerfilDTO convertir_perfil_a_dtoperfil(Perfil perfil);

    List<PerfilDTO> convertir_lista_a_listadtoperfil(List<Perfil> lista);
}
