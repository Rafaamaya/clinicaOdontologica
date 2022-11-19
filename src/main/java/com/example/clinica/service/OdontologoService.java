package com.example.clinica.service;

import com.example.clinica.dao.IDao;
import com.example.clinica.dao.impl.OdontologoDaoH2;
import com.example.clinica.domain.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService implements IOdontologoService {
    private IDao<Odontologo> odontologoDao = new OdontologoDaoH2();


    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }
    public OdontologoService() {

    }


    public IDao<Odontologo> getOdontologoDao() {
        return odontologoDao;
    }
    public void setOdontologoDao(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }


    @Override
    public List<Odontologo> listarOdontologo() {
/*        return Arrays.asList(
                new Odontologo("Ortiz", "MArtin", "99999"),
                new Odontologo("Borges", "Manuel", "44444")
        );*/

/*        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        return odontologoDaoH2.buscarTodos();*/
        return this.odontologoDao.buscarTodos();
    }
    @Override
    public Odontologo buscarOdontologo(int id) {
        return this.odontologoDao.buscar(id);
    }
    @Override
    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return this.odontologoDao.guardar(odontologo);
    }

    @Override
    public String eliminarOdontologo(Integer id) {
        odontologoDao.eliminar(id);
        return "Se elimino el Odontologo con id: " + id;
    }


}
