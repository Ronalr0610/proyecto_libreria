/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.app_basespring.controller;

import com.ronal.app_basespring.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Ronal
 */
@Controller
public class AppController {

    @GetMapping
    public String iniciar(){
        return "autenticar";
    }
    
    @GetMapping("/index")
    public String iniciarI(){
        return "index";
    }


}
