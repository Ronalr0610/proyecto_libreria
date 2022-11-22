package testApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.github.javafaker.Faker;
import com.ronal.app_basespring.entity.Estudiante;
import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.service.EstudianteService;

import java.util.List;

import com.ronal.app_basespring.service.LibroService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;


/**
 *
 * @author Vinni@
 */
@SpringBootTest("test")
@SpringBootConfiguration
@ActiveProfiles("test") 
public class PruebasTest {
    
    @Autowired
    private EstudianteService estudianteService;
    @Autowired
    private LibroService libroService;

    @Test
    public void TestEjemploNull() throws Exception{
        Faker faker = new Faker();
        String nombre = faker.name().name();
        assertFalse(nombre.length() == 0);

    }

    @Test
    public void testService() throws Exception{
        Faker faker = new Faker();
        List<Estudiante> lista = estudianteService.readEstudiantes();
        assertFalse(lista.size() >0);

    }

    @Test
    public void testServicelibro() throws Exception{
        Faker faker = new Faker();
        List<Libro> listalibro = libroService.obtenerLibros();
        assertFalse(listalibro.size() >0);
    }
}
