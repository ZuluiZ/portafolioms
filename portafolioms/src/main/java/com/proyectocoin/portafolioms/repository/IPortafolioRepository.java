package com.proyectocoin.portafolioms.repository;

import com.proyectocoin.portafolioms.model.Portafolio;
import com.proyectocoin.portafolioms.model.Portafolio_Transaccion;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPortafolioRepository extends CrudRepository<Portafolio,Long> {

    List<Portafolio> findByName(String Name);

}
