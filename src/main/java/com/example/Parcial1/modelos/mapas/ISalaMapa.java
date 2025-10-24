package com.example.Parcial1.modelos.mapas;

import com.example.Parcial1.modelos.DTO.SalaDTO;
import com.example.Parcial1.modelos.Sala;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISalaMapa {

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "capacidad", target = "capacidad")
    @Mapping(source = "tipoSala", target = "tipoSala")
    @Mapping(source = "ubicacion", target = "ubicacion")
    SalaDTO convertir_sala_a_dtosala(Sala sala);

    List<SalaDTO> convertir_lista_a_listadtosala(List<Sala> lista);
}
