package com.ar.azaharfundas.repository;

import com.ar.azaharfundas.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long>{
    
}
