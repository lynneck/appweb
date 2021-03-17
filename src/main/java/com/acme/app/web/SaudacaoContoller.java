package com.acme.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoContoller {


    @GetMapping("/ola")
    public String ola(){
        return  "Ola caro aluno";
    }

    @PostMapping("/ola")
    public String OlaPessoa(@RequestBody String nome){

        return  "Ola, " + (nome);
    }


    @GetMapping("/saudacao")
    public String saudacao(){
        return  "bom dia Paulo";
    }
}
