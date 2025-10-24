package com.example.Parcial1.modelos;

import com.example.Parcial1.ayudas.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres", nullable = false, unique = false)
    private String nombres;
    @Column(name = "apellidos", nullable = false, unique = false)
    private String apellidos;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "documento", nullable = false, unique = true, length = 10)
    private Integer documento;
    @Column(name = "telefono", nullable = false, unique = false, length = 12)
    private Integer telefono;
    @Column(name = "fechaRegistro", nullable = false, unique = false)
    private LocalDate fechaResgitro;
    @Column(name = "puntosFidelidad", nullable = false, unique = false)
    private Integer puntosFidelidad;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCliente", nullable = false, unique = false)
    private TipoCliente tipoCliente;
    @Column(name = "activo", nullable = false, unique = false)
    private Boolean activo;
    @Column(name = "preferenciaIdioma", nullable = false, unique = false)
    private String preferenciaIdioma;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference(value = "relacionClienteReserva")
    private List<Reserva> reserva;

    @OneToOne
    @JoinColumn(name = "fk_perfil1", referencedColumnName = "fechaNacimiento")
    @JoinColumn(name = "fk_perfil2", referencedColumnName = "direccion")
    @JsonManagedReference(value = "relacionClientePerfil")
    private Perfil perfil;


    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String apellidos, String email, Integer documento, Integer telefono, LocalDate fechaResgitro, Integer puntosFidelidad, TipoCliente tipoCliente, Boolean activo, String preferenciaIdioma) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
        this.fechaResgitro = fechaResgitro;
        this.puntosFidelidad = puntosFidelidad;
        this.tipoCliente = tipoCliente;
        this.activo = activo;
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getPreferenciaIdioma() {
        return preferenciaIdioma;
    }

    public void setPreferenciaIdioma(String preferenciaIdioma) {
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
