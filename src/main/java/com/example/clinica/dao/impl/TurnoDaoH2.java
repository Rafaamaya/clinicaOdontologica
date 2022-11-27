package com.example.clinica.dao.impl;

import com.example.clinica.dao.IDao;
import com.example.clinica.domain.Odontologo;
import com.example.clinica.domain.Paciente;
import com.example.clinica.domain.Turno;
import com.example.clinica.service.PacienteService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TurnoDaoH2 implements IDao<Turno> {

    private List<Turno> turnoList;

    public TurnoDaoH2() {
        turnoList = new ArrayList<>();

        //PacienteDaoH2 pacienteDaoH2 = new PacienteDaoH2();
        //Paciente paciente = pacienteDaoH2.buscar(1);

        PacienteService pacienteService = new PacienteService();
        Paciente paciente = pacienteService.buscarPaciente(1);

        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        Odontologo odontologo = odontologoDaoH2.buscar(5);
        Turno turno = new Turno(1, paciente, odontologo, LocalDate.of(2022, 04, 29));
        turnoList.add(turno);
    }

    @Override
    public Turno guardar(Turno turno) {
        this.turnoList.add(turno);
        return this.buscar(turno.getId());
    }

    @Override
    public Turno buscar(int id) {
        for (Turno t : turnoList) {
            if (id == t.getId()) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        for (Turno t : turnoList) {
            if (id == t.getId()) {
                turnoList.remove(t);
            }
        }
    }

    @Override
    public List<Turno> buscarTodos() {
        return this.turnoList;
    }

    @Override
    public Turno actualizar(Turno turno) {
        this.eliminar(turno.getId());
        this.guardar(turno);
        return this.buscar(turno.getId());
    }
}
