package com.ronal.app_basespring.controller;

import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.entity.Reserva;
import com.ronal.app_basespring.service.LibroService;
import com.ronal.app_basespring.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @Autowired
    LibroService libroService;

    @PostMapping
    public String registroReserva(@ModelAttribute("reservas") Reserva reservaDTO) {

        if (reservaService.crearReserva(reservaDTO)){
            System.out.println(reservaDTO);
            return "redirect:/registroReserva?exito";
        }
        return "redirect:/registroReserva?error";

    }
    @GetMapping("/registroReservaOK")
    public String verTablaLibros(Model modelo) {
        System.out.println("Modelo");
        System.out.println(modelo.getAttribute("reserva"));
        System.out.println(modelo.getAttribute("libros"));
        List<Libro> libros = libroService.obtenerLibros();
        List<Reserva> reservas = reservaService.obtenerReserva();
        modelo.addAttribute("reservas", reservas);
        modelo.addAttribute("libros",libros);
        //modelo.addAttribute("estudiantes", reservaService.ConsultaTodos());
        return "reserva";
    }

    @ModelAttribute("reservas")
    public Reserva retornarRegistroReservaDTO() {
        return new Reserva();
    }

    @GetMapping
    public String getRegistroReserva() {
        return "reserva";
    }

}
