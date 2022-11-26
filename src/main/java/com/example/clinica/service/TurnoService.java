package com.example.clinica.service;

import com.example.clinica.dao.IDao;
import com.example.clinica.dao.impl.OdontologoDaoH2;
import com.example.clinica.dao.impl.TurnoDaoH2;
import com.example.clinica.domain.Odontologo;
import com.example.clinica.domain.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TurnoService implements ITurno{

private IDao<Turno> turnoIDao = new TurnoDaoH2();

    @Override
    public List<Turno> listarTurno() {
        return turnoIDao.buscarTodos();
    }

    @Override
    public Turno buscarTurno(int id) {
        return turnoIDao.buscar(id);
    }

    @Override
    public Turno guardarTurno(Turno turno) {
        return turnoIDao.guardar(turno);
    }

    @Override
    public String eliminarTurno(Integer id) {
        turnoIDao.eliminar(id);
        return "Se elimino el Turno con id: " + id;
    }

    @Override
    public Turno actualizar(Turno turno) {
        return turnoIDao.actualizar(turno);
    }
}
