package com.example.Parcial1.modelos;

import com.example.Parcial1.ayudas.EstadoReserva;
import com.example.Parcial1.ayudas.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "codigoReserva", nullable = false, unique = true)
    private Integer codigoReserva;
    @Column(name = "fechaHora", nullable = false, unique = false)
    private String fechaHora;
    @Column(name = "cantidadBoletos", nullable = false, unique = false)
    private Integer cantidadBoletos;
    @Column(name = "precioUnitario", nullable = false, unique = false)
    private Long precioUnitario;
    @Column(name = "total", nullable = false, unique = false)
    private Long total;
    @Column(name = "metodoPago", nullable = false, unique = false)
    private String metodoPago;
    @Column(name = "asientos", nullable = false, unique = true)
    private String asientos;
    @Enumerated(EnumType.STRING)
    @Column(name = "estadoReserva", nullable = false, unique = false)
    private EstadoReserva estadoReserva;
    @Column(name = "canalVenta", nullable = false, unique = false)
    private String canalVenta;
    @Column(name = "notas", nullable = false, unique = false)
    private String notas;

    @ManyToOne
    @JsonManagedReference(value = "relacionClienteReserva")
    private Cliente cliente;

    @ManyToOne
    @JsonManagedReference(value = "relacionReservaPelicula")
    private Pelicula pelicula;

    @ManyToOne
    @JsonManagedReference(value = "relacionSalaReserva")
    private Sala sala;

    public Reserva() {
    }

    public Reserva(Integer id, Integer codigoReserva, String fechaHora, Integer cantidadBoletos, Long precioUnitario, Long total, String metodoPago, String asientos, EstadoReserva estadoReserva, String canalVenta, String notas) {
        this.id = id;
        this.codigoReserva = codigoReserva;
        this.fechaHora = fechaHora;
        this.cantidadBoletos = cantidadBoletos;
        this.precioUnitario = precioUnitario;
        this.total = total;
        this.metodoPago = metodoPago;
        this.asientos = asientos;
        this.estadoReserva = estadoReserva;
        this.canalVenta = canalVenta;
        this.notas = notas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getCanalVenta() {
        return canalVenta;
    }

    public void setCanalVenta(String canalVenta) {
        this.canalVenta = canalVenta;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
