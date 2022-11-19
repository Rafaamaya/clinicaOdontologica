package com.example.clinica.controller;

import com.example.clinica.domain.Paciente;
import com.example.clinica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("paciente")
public class Pacienteontroller {

    private final IPacienteService IPacienteService;

    @Autowired
    public Pacienteontroller(IPacienteService IPacienteService) {
        this.IPacienteService = IPacienteService;
    }


    @GetMapping("/listar")
    public List<Paciente> getPacienteList() {
        return IPacienteService.listadoPaciente();
    }

    @GetMapping("/buscar")
    public Paciente getPaciente() {
        return IPacienteService.buscarPaciente("tere@gmail.com");
    }
}
