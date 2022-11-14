package com.example.clinica.domain;

import java.util.Date;

public class Paciente {

/*    private Integer Id;*/
    private String apellido;
    private String nombre;
    private String email;
    private String dni;
    private Date fecha;


    public Paciente(String apellido, String nombre, String email, Date fecha) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
