package com.ronal.app_basespring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Estudiante usuarioId;
    private Libro libroId;
    private Date fechaInicial;
    private Date fechaFinal;
}
