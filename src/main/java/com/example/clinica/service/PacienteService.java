package com.example.clinica.service;

import com.example.clinica.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPacienteService {


    @Override
    public List<Paciente> listadoPaciente() {
        return Arrays.asList(new Paciente("Amaya","Javier","yo@gmail.com", new Date()),
                new Paciente("Perez","Ramon", "yo@gmail.com", new Date()),
                new Paciente("Gonzalez","Teresa", "tere@gmail.com", new Date()));
    }

    @Override
    public Paciente buscarPaciente(String email) {
        List<Paciente> pacienteList = Arrays.asList(new Paciente("Amaya","Javier","yo@gmail.com", new Date()),
                new Paciente("Perez","Ramon", "yo@gmail.com", new Date()),
                new Paciente("Gonzalez","Teresa", "tere@gmail.com", new Date()));

        for (Paciente item: pacienteList) {
            if(item.getEmail().equals(email)){
                return item;
            }
        }
        return null;
    }
}
