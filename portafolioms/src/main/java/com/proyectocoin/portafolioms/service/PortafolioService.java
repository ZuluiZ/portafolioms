package com.proyectocoin.portafolioms.service;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.repository.IPortafolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortafolioService {
    @Autowired
    private IPortafolioRepository portafolioRepository;

    public void crearPortafolio(Portafolio portafolio) {

        List<Portafolio> portafoliosByNombre = portafolioRepository.findByNombre(portafolio.getNombre());
        if (!portafoliosByNombre.isEmpty()){
            throw new RuntimeException("Ya hay un portafolio existente con ese nombre");
        }

        portafolioRepository.save(portafolio);
    }

    public List<Portafolio> getByName(String Nombre){
        return portafolioRepository.findByNombre(Nombre);
    }
}
