package com.example.clinica.service;

import com.example.clinica.domain.Odontologo;
import com.example.clinica.domain.Turno;

import java.util.List;

public interface ITurno {

    List<Turno> listarTurno();
    Turno buscarTurno (int id);
    Turno guardarTurno(Turno turno);
    String eliminarTurno (Integer id);
    Turno actualizar(Turno turno);
}
