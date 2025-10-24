package com.example.Parcial1.modelos.DTO;

import com.example.Parcial1.ayudas.EstadoCivil;

public class PerfilDTO {

    private String direccion;
    private String ciudad;
    private Integer telefonoAlterno;
    private EstadoCivil estadoCivil;
    private String ocupacion;

    public PerfilDTO() {
    }

    public PerfilDTO(String direccion, String ciudad, Integer telefonoAlterno, EstadoCivil estadoCivil, String ocupacion) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefonoAlterno = telefonoAlterno;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTelefonoAlterno() {
        return telefonoAlterno;
    }

    public void setTelefonoAlterno(Integer telefonoAlterno) {
        this.telefonoAlterno = telefonoAlterno;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
