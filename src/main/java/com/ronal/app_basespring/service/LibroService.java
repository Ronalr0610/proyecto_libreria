package com.ronal.app_basespring.service;

import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.repository.LibroRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Transactional
    public boolean crearLibro(Libro libro){
        try {
            if (!libroRepository.equals(libro.getCodigo())){

                libroRepository.save(libro);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
    //listar los libros
    public List<Libro> obtenerLibros(){
        return libroRepository.findAll();
    }
}