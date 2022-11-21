package com.ronal.app_basespring.controller;

import com.ronal.app_basespring.entity.Estudiante;
import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.service.EstudianteService;
import com.ronal.app_basespring.service.LibroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/registroLibro")
public class registrolibroController {

    @Autowired
    LibroServices libroServices;

    @PostMapping
    public String registroLibro(@ModelAttribute("libros") Libro libroDTO) {

        if (libroServices.crearLibro(libroDTO)){
            System.out.println(libroDTO);
            return "redirect:/registroLibro?exito";
        }
        return "redirect:/registroLibro?error";

    }

    @GetMapping("/registroLibroOK")
    public String verTablaLibros(Model modelo) {
        System.out.println("Modelo");
        System.out.println(modelo.getAttribute("libros"));

        List<Libro> libros = libroServices.obtenerLibro();
        modelo.addAttribute("libros", libros);
        //modelo.addAttribute("estudiantes", servicioEstudiante.ConsultaTodos());
        return "formulario";
    }

    @ModelAttribute("libros")
    public Libro retornarRegistroLibroDTO() {
        return new Libro();
    }

    @GetMapping
    public String getRegistro() {
        return "formulario";
    }
}
