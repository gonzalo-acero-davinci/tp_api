package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bienvenida {


       @RequestMapping("/home")
        public String bienvenida(){
               return "<h1>Hola Mundo</h1>";
       }
}
