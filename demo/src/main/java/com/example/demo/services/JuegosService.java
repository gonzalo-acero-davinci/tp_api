package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.JuegoModel;
import com.example.demo.repositories.JuegoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegosService {

    @Autowired
    JuegoRepository JuegoRepository;

    public ArrayList<JuegoModel> obtenerJuego(){
        return (ArrayList<JuegoModel>) JuegoRepository.findAll();
    }

    public JuegoModel guardarJuego(JuegoModel juego){
        return JuegoRepository.save(juego);
    }

    public Optional<JuegoModel> obtenerPorId(Long id){
        return JuegoRepository.findById(id);
    }

    public ArrayList<JuegoModel> obtenerPorPrioridad(String descripcion){
        return JuegoRepository.findByDescripcion(descripcion);
    }

    public ArrayList<JuegoModel> obtenerPorNombre(String nombre){
        return JuegoRepository.findByNombre(nombre);
    }

    public boolean eliminarJuego(Long id){
        try{
            JuegoRepository.deleteById(id);
            return true;
        } catch(Exception error){
            return false;
        }
    }

}