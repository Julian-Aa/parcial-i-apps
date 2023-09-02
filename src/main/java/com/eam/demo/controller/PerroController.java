package com.eam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.eam.demo.model.Perro;

import jakarta.persistence.Index;

import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class PerroController {

    @GetMapping("/")
    public String inicio(Model model) {
        Perro perro = new Perro();
        perro.setIdPerro(323);
        perro.setNombre("max");
        perro.setRaza("doberman");
        perro.setNombreDueno("Julian");
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(perro);
        model.addAttribute("perros",perros);
        return "index";
    }


}
