package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "juegos")
public class JuegoModel {

    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String clasificacion;
    private String descripcion;

    // Setters y Getters

    public void setId(Long id){
        this.id = id;
    }

    public Long getIdLong(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEmail(String clasificacion){
        this.clasificacion = clasificacion;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

}