package com.proyectocoin.portafolioms.controller;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.service.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portafolio")
public class PortafolioController {
    @Autowired
    private PortafolioService portafolioService;

    @PostMapping
    public void create(@RequestBody Portafolio portafolio){portafolioService.crearPortafolio(portafolio);}

    @GetMapping
    public List<Portafolio> getPortafoliosByName(@RequestParam(name = "nombre")String Name){
        return portafolioService.getByName(Name);
    }


}
