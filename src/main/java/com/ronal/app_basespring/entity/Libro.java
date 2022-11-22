package com.ronal.app_basespring.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro implements Serializable{

    @Id
    private Long codigo;
    private String tipo;
    private String nombre;
    private Long cantidad;

}
