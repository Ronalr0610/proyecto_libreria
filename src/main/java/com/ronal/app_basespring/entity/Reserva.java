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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    private Estudiante usuarioId;
    @ManyToOne
    @JoinColumn(name = "codigo", referencedColumnName = "codigo")
    private Libro libroId;
    private Date fechaInicial;
    private Date fechaFinal;
}
