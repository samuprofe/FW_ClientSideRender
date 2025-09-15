package com.example.PrimerProyectoSpring.controllers;

import com.example.PrimerProyectoSpring.entities.Mensaje;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MensajesController {

    public MensajesController()
    {

    }

//    @GetMapping("/")
//    public List<String> obtenerMensajes(){
//
//    }

    @GetMapping("/mensajes/{id}")
    public Mensaje getMensaje(Long id){
        Mensaje m = Mensaje.builder()
                .texto("texto del mensaje")
                .titulo("titulo del mensaje")
                .id(1L)
                .fecha(LocalDateTime.now())
                .build();
        return m;
    }
}
