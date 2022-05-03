package com.proyectocoin.portafolioms.repository;

import com.proyectocoin.portafolioms.model.Transaccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITransaccionRepository extends CrudRepository <Transaccion, Long>{ }
