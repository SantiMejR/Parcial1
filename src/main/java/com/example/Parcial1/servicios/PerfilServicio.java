package com.example.Parcial1.servicios;

import com.example.Parcial1.modelos.Cliente;
import com.example.Parcial1.modelos.DTO.ClienteGenericoDTO;
import com.example.Parcial1.modelos.DTO.PerfilDTO;
import com.example.Parcial1.modelos.Perfil;
import com.example.Parcial1.modelos.mapas.IClienteMapa;
import com.example.Parcial1.modelos.mapas.IPerfilMapa;
import com.example.Parcial1.repositorios.IClienteRepositorio;
import com.example.Parcial1.repositorios.IPerfilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PerfilServicio {

    @Autowired
    private IPerfilRepositorio repositorio;

    @Autowired
    private IPerfilMapa mapa;

    public PerfilDTO guardarPerfil(Perfil datosPerfil){

        if(this.repositorio.findByDireccion(datosPerfil.getDireccion()).isPresent()){

            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Ya existe un perfil registrado con esa direccion"
            );
        }

        Perfil perfilQueGuardoElRepo=this.repositorio.save(datosPerfil);
        if(perfilQueGuardoElRepo==null){

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error al guardar el perfil en la base de datos"
            );

        }

        return this.mapa.convertir_perfil_a_dtoperfil(perfilQueGuardoElRepo);
    }
}
