package com.example.Parcial1.modelos.DTO;

public class ReservaDTO {

    private Integer codigoReserva;
    private String fechaHora;
    private Integer cantidadBoletos;
    private String asientos;

    public ReservaDTO() {
    }

    public ReservaDTO(Integer codigoReserva, String fechaHora, Integer cantidadBoletos, String asientos) {
        this.codigoReserva = codigoReserva;
        this.fechaHora = fechaHora;
        this.cantidadBoletos = cantidadBoletos;
        this.asientos = asientos;
    }

    public Integer getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Integer codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(Integer cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
}
