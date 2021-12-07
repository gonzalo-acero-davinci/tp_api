package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.JuegoModel;
import com.example.demo.services.JuegosService;
import com.example.demo.services.JuegosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/juegos")
public class JuegoController {

    @Autowired
    JuegosService juegosService;

    @GetMapping()
    public ArrayList<JuegoModel> obtenerJuego(){
        return juegosService.obtenerJuego();
    }

    @PostMapping()
    public JuegoModel guardarJuegos(@RequestBody JuegoModel juegos){
        return this.juegosService.guardarJuego(juegos);
    }

    @GetMapping(path = "/{id}")
    public Optional<JuegoModel> obtenerJuegoPorId(@PathVariable("id") Long id){
        return this.juegosService.obtenerPorId(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<JuegoModel> obtenerJuegoPorDescripcion(@RequestParam("descripcion") String descripcion){
        return this.juegosService.obtenerPorPrioridad(descripcion);
    }

    @GetMapping(path = "/")
    public ArrayList<JuegoModel> obtenerJuegoPorNombre(@RequestParam("nombre") String nombre){
        return this.juegosService.obtenerPorNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.juegosService.eliminarJuego(id);
        if(ok){
            return "Se eliminó el usuario con id: " + id;
        } else {
            return "No se pudo eliminar el usuario id: " + id;
        }
    }

}