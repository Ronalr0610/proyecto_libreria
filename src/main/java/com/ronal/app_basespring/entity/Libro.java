package com.ronal.app_basespring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro implements Serializable{

    @Id
    private Integer codigo;
    private String nombre;
    private Integer cantidad;
    private String tipo;
}
