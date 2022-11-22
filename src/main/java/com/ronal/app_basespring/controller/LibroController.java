package com.ronal.app_basespring.controller;

import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.service.LibroService;
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
public class LibroController {

    @Autowired
    LibroService libroService;

    @PostMapping
    public String registroLibro(@ModelAttribute("libros") Libro libro) {

        if (libroService.crearLibro(libro)){
            return "redirect:/registroLibro?exito";
        }
        return "redirect:/registroLibro?error";

    }
    @ModelAttribute("libros")
    public Libro RegistroLibro() {
        return new Libro();
    }

    @GetMapping
    public String mostarFormulario() {
        return "formulario";
    }
    @GetMapping("/registroLibro")
    public String verTablaLibros(Model modelo) {
        /*Libro uno= new Libro(141241,"julian",20,"infantil");
        // libros.add(uno);
        for(int i=0; i<libros.size();i++){
            System.out.println(libros.get(i).getNombre());
        }*/
        modelo.addAttribute("libros", libroService.obtenerLibros());
        //modelo.addAttribute("estudiantes", servicioEstudiante.ConsultaTodos());
        return "formulario";
    }


}
