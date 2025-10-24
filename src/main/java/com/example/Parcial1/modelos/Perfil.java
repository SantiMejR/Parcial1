package com.example.Parcial1.modelos;

import com.example.Parcial1.ayudas.EstadoCivil;
import com.example.Parcial1.ayudas.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fechaNacimiento", nullable = false, unique = false)
    private LocalDate fechaNacimiento;
    @Column(name = "direccion", nullable = false, unique = false)
    private String direccion;
    @Column(name = "ciudad", nullable = false, unique = false)
    private String ciudad;
    @Column(name = "telefonoAlterno", nullable = false, unique = true, length = 12)
    private Integer telefonoAlterno;
    @Enumerated(EnumType.STRING)
    @Column(name = "estadoCivil", nullable = false, unique = false)
    private EstadoCivil estadoCivil;
    @Column(name = "ocupacion", nullable = false, unique = false)
    private String ocupacion;
    @Column(name = "preferencias", nullable = false, unique = false)
    private String preferencias;
    @Column(name = "alergias", nullable = false, unique = false)
    private String alergias;
    @Column(name = "marketingOptLn", nullable = false, unique = false)
    private String marketingOptLn;
    @Column(name = "contactoEmergencia", nullable = false, unique = true, length = 12)
    private Integer contactoEmergencia;


    @OneToOne(mappedBy = "perfil")
    @JoinColumn(name = "fk_cliente", referencedColumnName = "telefono")
    @JsonManagedReference(value = "relacionClientePerfil")
    private Cliente cliente;


    public Perfil() {
    }

    public Perfil(Integer id, LocalDate fechaNcimiento, String direccion, String ciudad, Integer telefonoAlterno, EstadoCivil estadoCivil, String ocupacion, String preferencias, String alergias, String marketingOptLn, Integer contactoEmergencia) {
        this.id = id;
        this.fechaNacimiento = fechaNcimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefonoAlterno = telefonoAlterno;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.preferencias = preferencias;
        this.alergias = alergias;
        this.marketingOptLn = marketingOptLn;
        this.contactoEmergencia = contactoEmergencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaNcimiento() {
        return fechaNacimiento;
    }

    public void setFechaNcimiento(LocalDate fechaNcimiento) {
        this.fechaNacimiento = fechaNcimiento;
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

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMarketingOptLn() {
        return marketingOptLn;
    }

    public void setMarketingOptLn(String marketingOptLn) {
        this.marketingOptLn = marketingOptLn;
    }

    public Integer getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(Integer contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
}
