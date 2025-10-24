package com.example.Parcial1.modelos.mapas;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteEspecialDTO;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapa {

    //Generico

    @Mapping(source = "nombres", target = "nombres")
    @Mapping(source = "apellidos", target = "apellidos")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "documento", target = "documento")
    @Mapping(source = "telefono", target = "telefono")
    ClienteGenericoDTO convertir_cliente_a_dto_clientegenericodto(Cliente cliente);

    List<ClienteGenericoDTO> convertir_lista_a_listadtogenerico(List<Cliente> lista);

    //Especial

    @Mapping(source = "nombres", target = "nombres")
    @Mapping(source = "apellidos", target = "apellidos")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "documento", target = "documento")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "fechaRegistro", target = "fechaRegistro")
    @Mapping(source = "puntosFidelidad", target = "puntosFidelidad")
    @Mapping(source = "preferenciaIdioma", target = "preferenciaIdioma")
    ClienteEspecialDTO convertir_cliente_a_dto_clienteespecialdto(Cliente cliente);

    List<ClienteEspecialDTO> convertir_lista_a_listadtoespecial(List<Cliente> lista);


}
