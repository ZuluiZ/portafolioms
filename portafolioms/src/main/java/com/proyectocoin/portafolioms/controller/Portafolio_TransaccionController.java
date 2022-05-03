package com.proyectocoin.portafolioms.controller;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.model.Portafolio_Transaccion;
import com.proyectocoin.portafolioms.service.Portafolio_TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portafolio-transaccion")
public class Portafolio_TransaccionController {

    @Autowired
    private Portafolio_TransaccionService portafolio_transaccionService;

    @PostMapping
    public void create(@RequestBody Portafolio_Transaccion portafolio_transaccion){
        portafolio_transaccionService.crearPortafolio_Transaccion(portafolio_transaccion);
    }

    @GetMapping
    public Portafolio_Transaccion getPortafolio_TransaccionById(@RequestParam (name = "id")Long id){
        return portafolio_transaccionService.getById(id);
    }



}
