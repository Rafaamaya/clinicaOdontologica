package com.example.clinica.service;

import com.example.clinica.domain.Paciente;

import java.util.List;

public interface IPacienteService {
    List<Paciente> listadoPaciente();

    Paciente buscarPaciente(String email);
}
