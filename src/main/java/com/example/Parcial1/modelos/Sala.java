package com.example.Parcial1.modelos;

import com.example.Parcial1.ayudas.TipoCliente;
import com.example.Parcial1.ayudas.TipoSala;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false, unique = false)
    private String nombre;
    @Column(name = "capacidad", nullable = false, unique = false)
    private Integer capacidad;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoSala", nullable = false, unique = true)
    private TipoSala tipoSala;
    @Column(name = "ubicacion", nullable = false, unique = true)
    private String ubicacion;
    @Column(name = "numeroPiso", nullable = false, unique = false)
    private Integer numeroPiso;
    @Column(name = "accesoDiscapacidad", nullable = false, unique = false)
    private Boolean accesoDiscapacidad;
    @Column(name = "sonidoDolby", nullable = false, unique = false)
    private Boolean sonidoDolby;
    @Column(name = "anchoPantallaMetros", nullable = false, unique = false)
    private Integer anchoPantallaMetros;
    @Column(name = "altoPantallaMetros", nullable = false, unique = false)
    private Integer altoPantallaMetros;
    @Column(name = "observacionesTecnicas", nullable = false, unique = false)
    private String observacionesTecnicas;


    @OneToMany(mappedBy = "sala")
    @JsonManagedReference(value = "relacionSalaReserva")
    private List<Reserva> reserva;

    public Sala() {
    }

    public Sala(Integer id, String nombre, Integer capacidad, TipoSala tipoSala, String ubicacion, Integer numeroPiso, Boolean accesoDiscapacidad, Boolean sonidoDolby, Integer anchoPantallaMetros, Integer altoPantallaMetros, String observacionesTecnicas) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.ubicacion = ubicacion;
        this.numeroPiso = numeroPiso;
        this.accesoDiscapacidad = accesoDiscapacidad;
        this.sonidoDolby = sonidoDolby;
        this.anchoPantallaMetros = anchoPantallaMetros;
        this.altoPantallaMetros = altoPantallaMetros;
        this.observacionesTecnicas = observacionesTecnicas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Boolean getAccesoDiscapacidad() {
        return accesoDiscapacidad;
    }

    public void setAccesoDiscapacidad(Boolean accesoDiscapacidad) {
        this.accesoDiscapacidad = accesoDiscapacidad;
    }

    public Boolean getSonidoDolby() {
        return sonidoDolby;
    }

    public void setSonidoDolby(Boolean sonidoDolby) {
        this.sonidoDolby = sonidoDolby;
    }

    public Integer getAnchoPantallaMetros() {
        return anchoPantallaMetros;
    }

    public void setAnchoPantallaMetros(Integer anchoPantallaMetros) {
        this.anchoPantallaMetros = anchoPantallaMetros;
    }

    public Integer getAltoPantallaMetros() {
        return altoPantallaMetros;
    }

    public void setAltoPantallaMetros(Integer altoPantallaMetros) {
        this.altoPantallaMetros = altoPantallaMetros;
    }

    public String getObservacionesTecnicas() {
        return observacionesTecnicas;
    }

    public void setObservacionesTecnicas(String observacionesTecnicas) {
        this.observacionesTecnicas = observacionesTecnicas;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }
}
