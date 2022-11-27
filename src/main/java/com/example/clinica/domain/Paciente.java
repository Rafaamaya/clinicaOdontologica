package com.example.clinica.domain;

import java.util.Date;

public class Paciente {

    private Integer id;
    private String apellido;
    private String nombre;
    private String email;
    private String dni;
    private Date fecha;
    private Domicilio domicilio;


    public Paciente(Integer id,String apellido, String nombre, String dni, String email, Date fecha) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.fecha = fecha;
    }

    public Paciente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

