/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.app_basespring.repository;

import com.ronal.app_basespring.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ronal
 */
@Repository
public interface  EstudianteRepository extends JpaRepository<Estudiante, Integer>  {
    public boolean existsByCedula(Long cedula);
    public Estudiante findByEmail(String email);
    
}
