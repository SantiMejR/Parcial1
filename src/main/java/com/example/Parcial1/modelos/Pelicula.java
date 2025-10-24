package com.example.Parcial1.modelos;

import com.example.Parcial1.ayudas.ClasificacionPelicula;
import com.example.Parcial1.ayudas.EstadoCivil;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo", nullable = false, unique = true)
    private String titulo;
    @Column(name = "sinopsis", nullable = false, unique = true)
    private String sinopsis;
    @Column(name = "duracion", nullable = false, unique = false)
    private Integer duracionMin;
    @Column(name = "director", nullable = false, unique = false)
    private String director;
    @Column(name = "añoEstreno", nullable = false, unique = false)
    private Integer anoEstreno;
    @Enumerated(EnumType.STRING)
    @Column(name = "clasificacionPelicula", nullable = false, unique = false)
    private ClasificacionPelicula clasificacionPelicula;
    @Column(name = "idiomaOriginal", nullable = false, unique = false)
    private String idiomaOriginal;
    @Column(name = "paisOrigen", nullable = false, unique = false)
    private String paisOrigen;
    @Column(name = "ratingPromedio", nullable = false, unique = false)
    private String ratingPromedio;
    @Column(name = "generoPrincipal", nullable = false, unique = true)
    private String generoPrincipal;


    @OneToMany(mappedBy = "pelicula")
    @JsonManagedReference(value = "relacionReservaPelicula")
    private List<Reserva> reserva;

    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, String sinopsis, Integer duracionMin, String director, Integer anoEstreno, ClasificacionPelicula clasificacionPelicula, String idiomaOriginal, String paisOrigen, String ratingPromedio, String generoPrincipal) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.duracionMin = duracionMin;
        this.director = director;
        this.anoEstreno = anoEstreno;
        this.clasificacionPelicula = clasificacionPelicula;
        this.idiomaOriginal = idiomaOriginal;
        this.paisOrigen = paisOrigen;
        this.ratingPromedio = ratingPromedio;
        this.generoPrincipal = generoPrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(Integer anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public ClasificacionPelicula getClasificacionPelicula() {
        return clasificacionPelicula;
    }

    public void setClasificacionPelicula(ClasificacionPelicula clasificacionPelicula) {
        this.clasificacionPelicula = clasificacionPelicula;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getRatingPromedio() {
        return ratingPromedio;
    }

    public void setRatingPromedio(String ratingPromedio) {
        this.ratingPromedio = ratingPromedio;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }
}
