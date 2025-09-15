package com.example.PrimerProyectoSpring.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Mensaje {

    private Long id;
    private String titulo;
    private String texto;
    private LocalDateTime fecha;

}
