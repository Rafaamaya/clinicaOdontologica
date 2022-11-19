package com.example.clinica.service;

import com.example.clinica.domain.Odontologo;

import java.util.List;

public interface IOdontologoService {

    List<Odontologo> listarOdontologo();
    Odontologo buscarOdontologo (int id);
    Odontologo guardarOdontologo(Odontologo odontologo);
    String eliminarOdontologo (Integer id);
}
