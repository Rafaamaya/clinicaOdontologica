package com.example.clinica.service;

import com.example.clinica.domain.Odontologo;
import com.example.clinica.domain.Paciente;

import java.util.List;

public interface IPacienteService {
    List<Paciente> listadoPaciente();

    Paciente buscarPaciente(Integer id);

    Paciente guardarOdontologo(Paciente paciente);
    String eliminarOdontologo (Integer id);
}


