package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteEspecialDTO;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ClienteServicioEspecial {

    @Autowired
    private IClienteRepositorio repositorio;

    @Autowired
    private IClienteMapa mapa;

    public ClienteEspecialDTO guardarClienteEspecial(Cliente datosCliente){

        if(this.repositorio.findByDocumento(datosCliente.getDocumento()).isPresent()){

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un cliente registrado con ese numero de documento"
            );
        }

        Cliente clienteQueGuardoElRepo=this.repositorio.save(datosCliente);
        if(clienteQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar al cliente en la base de datos"
            );

        }

        return this.mapa.convertir_cliente_a_dto_clienteespecialdto(clienteQueGuardoElRepo);
    }
}
