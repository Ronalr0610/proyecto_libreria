/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.app_basespring.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ronal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Estudiante implements Serializable {
    
    @Id
    private Long cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
}
