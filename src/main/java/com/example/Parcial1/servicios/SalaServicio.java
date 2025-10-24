package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.DTO.SalaDTO;
import com.example.Parcial1.modelos.Sala;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.modelos.mapas.ISalaMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import com.example.Parcial1.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SalaServicio {

    @Autowired
    private ISalaRepositorio repositorio;

    @Autowired
    private ISalaMapa mapa;

    public SalaDTO guardarSala(Sala datosSala){


        Sala salaQueGuardoElRepo=this.repositorio.save(datosSala);
        if(salaQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar al cliente en la base de datos"
            );

        }

        return this.mapa.convertir_sala_a_dtosala(salaQueGuardoElRepo);
    }
}
