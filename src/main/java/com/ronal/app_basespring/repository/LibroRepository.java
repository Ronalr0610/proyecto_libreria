package com.ronal.app_basespring.repository;

import com.ronal.app_basespring.entity.Estudiante;
import com.ronal.app_basespring.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository< Libro, Integer>  {

}
