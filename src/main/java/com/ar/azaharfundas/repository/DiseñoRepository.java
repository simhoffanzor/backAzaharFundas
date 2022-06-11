package com.ar.azaharfundas.repository;

import com.ar.azaharfundas.model.Diseño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseñoRepository extends JpaRepository<Diseño, Long>{
    
}