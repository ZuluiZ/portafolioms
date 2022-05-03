package com.proyectocoin.portafolioms.service;


import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.model.Portafolio_Transaccion;
import com.proyectocoin.portafolioms.repository.IPortafolioRepository;
import com.proyectocoin.portafolioms.repository.IPortafolio_TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Portafolio_TransaccionService {
    @Autowired
    private IPortafolio_TransaccionRepository portafolio_transaccionRepository;

    public void crearPortafolio_Transaccion(Portafolio_Transaccion portafolio_transaccion) {

        portafolio_transaccionRepository.save(portafolio_transaccion);
    }

    public Portafolio_Transaccion getById(Long id){
        return portafolio_transaccionRepository.findById(id).orElse(null);
    }
}
