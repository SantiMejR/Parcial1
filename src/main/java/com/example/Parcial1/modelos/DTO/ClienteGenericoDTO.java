package com.example.Parcial1.modelos.DTO;

public class ClienteGenericoDTO {

    private String nombres;
    private String apellidos;
    private String email;
    private Integer documento;
    private Integer telefono;

    public ClienteGenericoDTO() {
    }

    public ClienteGenericoDTO(String nombres, String apellidos, String email, Integer documento, Integer telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
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
}
