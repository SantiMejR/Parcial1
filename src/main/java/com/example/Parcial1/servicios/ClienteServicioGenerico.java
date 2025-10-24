package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ClienteServicioGenerico {

    @Autowired
    private IClienteRepositorio repositorio;

    @Autowired
    private IClienteMapa mapa;

    public ClienteGenericoDTO guardarClienteGenerico(Cliente datosCliente){

        if(this.repositorio.findByEmail(datosCliente.getEmail()).isPresent()){

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un cliente registrado con el correo ingresado"
            );
        }

        Cliente clienteQueGuardoElRepo=this.repositorio.save(datosCliente);
        if(clienteQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar al cliente en la base de datos"
            );

        }

        return this.mapa.convertir_cliente_a_dto_clientegenericodto(clienteQueGuardoElRepo);
    }

}
