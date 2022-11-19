package com.example.clinica.controller;

import com.example.clinica.domain.Odontologo;
import com.example.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/odontologo")
public class OdontologoController {
    @Autowired
    private  OdontologoService odontologoService;


    @GetMapping("/listar")
    public List<Odontologo> getListarOdontologo(){
        return odontologoService.listarOdontologo();
    }
    @GetMapping("/buscar")
    public Odontologo getBuscarOdontologo(){
        return odontologoService.buscarOdontologo(3);
    }
    @GetMapping("/guardar")
    public Odontologo getGuardarOdontologo(){
        Odontologo odontologo1 = new Odontologo("Garcia", "Freddy","29422010");
        return odontologoService.guardarOdontologo(odontologo1);
    }
    @GetMapping("/eliminar")
    public String getEliminarOdontologo(){
        return odontologoService.eliminarOdontologo(11);
    }



}
