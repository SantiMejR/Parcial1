package com.example.Parcial1.modelos.DTO;

import com.example.Parcial1.ayudas.ClasificacionPelicula;

public class PeliculaDTO {

    private String titulo;
    private Integer duracionMin;
    private String director;
    private Integer anoEstreno;
    private ClasificacionPelicula clasificacionPelicula;

    public PeliculaDTO() {
    }

    public PeliculaDTO(String titulo, Integer duracionMin, String director, Integer anoEstreno, ClasificacionPelicula clasificacionPelicula) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.director = director;
        this.anoEstreno = anoEstreno;
        this.clasificacionPelicula = clasificacionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}
