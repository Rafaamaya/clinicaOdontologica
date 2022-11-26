package com.example.clinica.controller;

import com.example.clinica.domain.Odontologo;
import com.example.clinica.domain.Turno;
import com.example.clinica.service.OdontologoService;
import com.example.clinica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Turno> getListarOdontologo(){
        return turnoService.listarTurno();
    }

}
