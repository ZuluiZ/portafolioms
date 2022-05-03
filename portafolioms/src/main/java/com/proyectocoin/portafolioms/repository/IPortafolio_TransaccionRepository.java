package com.proyectocoin.portafolioms.repository;

import com.proyectocoin.portafolioms.model.Portafolio_Transaccion;
import com.proyectocoin.portafolioms.model.Transaccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPortafolio_TransaccionRepository extends CrudRepository <Portafolio_Transaccion, Long >{

    List<Transaccion> transaccionesByName(String Name);

}
