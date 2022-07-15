package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/saludo")
    public String holaMundo(){
        return "Hola Mundo!!";
    }
}
