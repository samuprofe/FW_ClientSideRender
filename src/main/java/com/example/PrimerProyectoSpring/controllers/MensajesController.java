package com.example.PrimerProyectoSpring.controllers;

import com.example.PrimerProyectoSpring.entities.Mensaje;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MensajesController {

    ArrayList<Mensaje> mensajes;

    public MensajesController()
    {
        Mensaje m1 = Mensaje.builder()
                .texto("texto del mensaje")
                .titulo("titulo del mensaje")
                .id(4L)
                .fecha(LocalDateTime.now())
                .build();
        Mensaje m2 = Mensaje.builder()
                .texto("texto del mensaje")
                .titulo("titulo del mensaje")
                .id(5L)
                .fecha(LocalDateTime.now())
                .build();
        mensajes = new ArrayList<>();
        mensajes.add(m1);
        mensajes.add(m2);
    }

    /**
     * GET http://localhost:8080/mensajes
     */
    @GetMapping("/mensajes")
    public List<Mensaje> obtenerMensajes(){

        return mensajes;
    }


    /**
     * GET http://localhost:8080/mensajes/1
     */
    @GetMapping("/mensajes/{id}")
    public Mensaje getMensaje(@PathVariable Long id){
        /*
        Recorrer el ArrayList para encontrar el mensaje con el id recibido como parámetro
         */
        for (Mensaje m : mensajes){
            if(m.getId() == id.intValue()){
                return m;
            }
        }
        return null;
    }

    /*
        POST http://localhost/mensajes --> Va a insertar un mensaje
     */
    @PostMapping("/mensajes")
    public Mensaje addMensaje(@RequestBody Mensaje mensajeNuevo){
         mensajes.add(mensajeNuevo);
         return mensajeNuevo;
    }

    @DeleteMapping("/mensajes/{id}")
    public Void deleteMensaje(@PathVariable Long id){
        //Recorrer el array y borrar el elemento cuyo id sea igual al que llega como parámetro
        for (Mensaje m : mensajes){
            if(m.getId().equals(id)){
                mensajes.remove(m);
            }
        }
        return null;
    }

    /*
    Editar Mensajes
    PUT http://localhost:8080/mensajes/1   Se envía un JSON con el mensaje editado
     */
    @PutMapping("/mensajes/{id}")
    public Mensaje editMensaje(@RequestBody Mensaje mensajeEditado, @PathVariable Long id){
        for (Mensaje m : mensajes){
            if(m.getId()!=null && m.getId().equals(id)){
                if(!mensajeEditado.getTexto().isEmpty()){
                    m.setTexto(mensajeEditado.getTexto());
                }
                if(!mensajeEditado.getTitulo().isEmpty()) {
                    m.setTitulo(mensajeEditado.getTitulo());
                }
                return m;
            }

        }
        return null;
    }

}
