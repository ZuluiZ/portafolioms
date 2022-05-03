package com.proyectocoin.portafolioms.controller;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.model.Transaccion;
import com.proyectocoin.portafolioms.service.PortafolioService;
import com.proyectocoin.portafolioms.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @PostMapping
    public void create(@RequestBody Transaccion transaccion){transaccionService.crearTransaccion(transaccion);}

    @GetMapping
    public Transaccion getTransaccionesById(@RequestParam(name = "id")Long id){
        return transaccionService.getById(id);
    }

    @GetMapping
    public Iterable<Transaccion> getAllTransaccionesById(@RequestParam(name = "id")Long id){
        return transaccionService.getAllById();
    }
}
