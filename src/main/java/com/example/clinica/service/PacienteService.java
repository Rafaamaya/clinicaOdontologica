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
        return Arrays.asList(new Paciente(1,"Amaya","Javier", "2942234","yo@gmail.com", new Date()),
                new Paciente(2,"Perez","Ramon","2942234","yo@gmail.com", new Date()),
                new Paciente(3,"Gonzalez","Teresa","2942234", "tere@gmail.com", new Date()));
    }

    @Override
    public Paciente buscarPaciente(Integer id) {
        List<Paciente> pacienteList = Arrays.asList(new Paciente(1,"Amaya","Javier","2942234","yo@gmail.com", new Date()),
                new Paciente(2,"Perez","Ramon","2942234", "yo@gmail.com", new Date()),
                new Paciente(3,"Gonzalez","Teresa","2942234", "tere@gmail.com", new Date()));
        for (Paciente item: pacienteList) {
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    @Override
    public Paciente guardarOdontologo(Paciente paciente) {
        return null;
    }

    @Override
    public String eliminarOdontologo(Integer id) {
        return null;
    }
}
