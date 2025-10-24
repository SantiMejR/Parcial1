package com.example.Parcial1.modelos.DTO;

import com.example.Parcial1.ayudas.TipoSala;

public class SalaDTO {

    private String nombre;
    private Integer capacidad;
    private TipoSala tipoSala;
    private String ubicacion;

    public SalaDTO() {
    }

    public SalaDTO(String nombre, Integer capacidad, TipoSala tipoSala, String ubicacion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
