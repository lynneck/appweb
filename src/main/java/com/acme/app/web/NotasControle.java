package com.acme.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotasControle {


    @GetMapping("/notas")
    public  String[] listar(){
        String[]notas = new String[] {"nota 1" , "nota 2"};

        return notas;

    }
}
