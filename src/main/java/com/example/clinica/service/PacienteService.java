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
        return Arrays.asList(new Paciente("Amaya","Javier", "2942234","yo@gmail.com", new Date()),
                new Paciente("Perez","Ramon","2942234","yo@gmail.com", new Date()),
                new Paciente("Gonzalez","Teresa","2942234", "tere@gmail.com", new Date()));
    }

    @Override
    public Paciente buscarPaciente(String email) {
        List<Paciente> pacienteList = Arrays.asList(new Paciente("Amaya","Javier","2942234","yo@gmail.com", new Date()),
                new Paciente("Perez","Ramon","2942234", "yo@gmail.com", new Date()),
                new Paciente("Gonzalez","Teresa","2942234", "tere@gmail.com", new Date()));

        for (Paciente item: pacienteList) {
            if(item.getEmail().equals(email)){
                return item;
            }
        }
        return null;
    }
}
