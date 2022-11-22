package com.example.clinica.controller;

import com.example.clinica.domain.Odontologo;
import com.example.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologo")
public class OdontologoController {

    @Autowired
    private  OdontologoService odontologoService;


    @GetMapping("/listar")
    @ResponseBody
    public List<Odontologo> getListarOdontologo(){
        return odontologoService.listarOdontologo();
    }
    @GetMapping("/buscar/{id}")
    public Odontologo getBuscarOdontologo(@PathVariable int id){
        return odontologoService.buscarOdontologo(id);
    }
/*    @GetMapping("/guardar")
    public Odontologo getGuardarOdontologo(@RequestParam String apellido,
                                           @RequestParam String nombre,
                                           @RequestParam String matricula){
        Odontologo odontologo = new Odontologo(apellido, nombre,matricula);
        return odontologoService.guardarOdontologo(odontologo);
    }*/
    @PostMapping("/guardar")
    public Odontologo getGuardarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }
    @DeleteMapping("/eliminar")
    public ResponseEntity getEliminarOdontologo(@RequestParam Integer id){
        ResponseEntity response = null;
        if(odontologoService.buscarOdontologo(id) == null){
            response = new ResponseEntity(HttpStatus.NOT_FOUND);
        }else{
            odontologoService.eliminarOdontologo(id);
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return response;
    }
    @PutMapping("/actualizar")
    public ResponseEntity<String> actualizarødontologo(@RequestBody Odontologo odontologo){
        ResponseEntity response = null;
        if(odontologoService.buscarOdontologo(odontologo.getId()) == null){
            response = new ResponseEntity("No existe el registro a modificar", HttpStatus.NOT_FOUND);
        }else{
            odontologoService.actualizar(odontologo);
            response = new ResponseEntity("Se modifici de forma correcta", HttpStatus.PARTIAL_CONTENT);

        }
        return response;
    }
}
