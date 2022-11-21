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

import com.ronal.app_basespring.service.LibroServices;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
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
    private LibroServices libroServices;

    @Test
    public void TestEjemploNull() {
        Faker faker = new Faker();
        String nombre = faker.name().name();

        assertFalse(nombre.length() == 0);

    }

    @Test
    public void testService() {
        Faker faker = new Faker();
        String nombre = faker.name().name();
        List<Estudiante> lista = estudianteService.readEstudiantes();
        assertFalse(lista.size() >0);

    }

    @Test
    public void testServicelibro() {
        Faker faker = new Faker();
        String nombre = faker.name().name();
        List<Libro> listalibro = libroServices.obtenerLibro();
        assertFalse(listalibro.size() >0);

    }
}
