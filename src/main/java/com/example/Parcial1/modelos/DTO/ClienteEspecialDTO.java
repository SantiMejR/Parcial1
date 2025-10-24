package com.example.Parcial1.modelos.DTO;

import java.time.LocalDate;

public class ClienteEspecialDTO {

    private String nombres;
    private String apellidos;
    private String email;
    private Integer documento;
    private Integer telefono;
    private LocalDate fechaResgitro;
    private Integer puntosFidelidad;
    private String preferenciaIdioma;

    public ClienteEspecialDTO() {
    }

    public ClienteEspecialDTO(String nombres, String apellidos, String email, Integer documento, Integer telefono, LocalDate fechaResgitro, Integer puntosFidelidad, String preferenciaIdioma) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
        this.fechaResgitro = fechaResgitro;
        this.puntosFidelidad = puntosFidelidad;
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaResgitro() {
        return fechaResgitro;
    }

    public void setFechaResgitro(LocalDate fechaResgitro) {
        this.fechaResgitro = fechaResgitro;
    }

    public Integer getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(Integer puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public String getPreferenciaIdioma() {
        return preferenciaIdioma;
    }

    public void setPreferenciaIdioma(String preferenciaIdioma) {
        this.preferenciaIdioma = preferenciaIdioma;
    }
}
