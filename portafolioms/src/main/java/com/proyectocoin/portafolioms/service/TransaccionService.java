package com.proyectocoin.portafolioms.service;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.model.Transaccion;
import com.proyectocoin.portafolioms.repository.IPortafolioRepository;
import com.proyectocoin.portafolioms.repository.ITransaccionRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {
    @Autowired
    private ITransaccionRepository transaccionRepository;

    public void crearTransaccion(Transaccion transaccion) {
        transaccionRepository.save(transaccion);
    }

    public Transaccion getById(Long id){
        return transaccionRepository.findById(id).orElse(null);
    }

    public Iterable<Transaccion> getAllById(){
        return transaccionRepository.findAll();
    }
}
