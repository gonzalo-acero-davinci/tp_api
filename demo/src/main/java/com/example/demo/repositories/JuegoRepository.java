package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.JuegoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends CrudRepository<JuegoModel, Long> {

    public abstract ArrayList<JuegoModel> findByDescripcion(String descripcion);

    public abstract ArrayList<JuegoModel> findByNombre(String nombre);

}
