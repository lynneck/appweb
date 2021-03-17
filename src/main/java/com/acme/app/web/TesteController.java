package com.acme.app.web;


import org.springframework.web.bind.annotation.*;

@RestController
public class TesteController {


    @PutMapping("/atualiza")
    public String Atualizar(){
        return  "Atualizando";
    }

    @GetMapping("/saudacao/maria")
    public String Maria(){
        return  "bom dia Maria";
    }
    @DeleteMapping( "/excluir/{id}")
    public  String  excluir(@PathVariable("id") String id){
        return  "excluindo registro " + id ;


    }
    @PutMapping("/atualizar/{codigo}")
    public  String atualizarPessoas (@PathVariable ("codigo") String codigo, @RequestBody String nome){
        return  "Atualizando o codigo " + codigo + "com o nome " + nome ;
    }


}
