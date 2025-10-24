package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.DTO.ReservaDTO;
import com.example.Parcial1.modelos.Reserva;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.modelos.mapas.IReservaMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import com.example.Parcial1.repositorios.IReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ReservaServicio {

    @Autowired
    private IReservaRepositorio repositorio;

    @Autowired
    private IReservaMapa mapa;

    public ReservaDTO guardarReserva(Reserva datosReserva){

        if(this.repositorio.findByCodigoReserva(datosReserva.getCodigoReserva()).isPresent()){

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe una reserva con un codigo de reserva igual"
            );
        }

        Reserva reservaQueGuardoElRepo=this.repositorio.save(datosReserva);
        if(reservaQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar la reserva en la base de datos"
            );

        }

        return this.mapa.convertir_reserva_a_dtoreserva(reservaQueGuardoElRepo);
    }
}
