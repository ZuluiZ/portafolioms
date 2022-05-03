package com.proyectocoin.portafolioms.service;

import com.proyectocoin.portafolioms.repository.IPortafolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortafolioService {
    @Autowired
    private IPortafolioRepository portafolioRepository;
}
