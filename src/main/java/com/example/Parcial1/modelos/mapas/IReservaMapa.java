package com.example.Parcial1.modelos.mapas;

import com.example.Parcial1.modelos.DTO.ReservaDTO;
import com.example.Parcial1.modelos.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IReservaMapa {

    @Mapping(source = "codigoReserva", target = "codigoReserva")
    @Mapping(source = "fechaHora", target = "fechaHora")
    @Mapping(source = "cantidadBoletos", target = "cantidadBoletos")
    @Mapping(source = "asientos", target = "asientos")
    ReservaDTO convertir_reserva_a_dtoreserva(Reserva reserva);

    List<ReservaDTO> convertir_lista_a_listadtoreserva(List<Reserva> lista);
}
