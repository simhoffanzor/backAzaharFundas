package com.ar.azaharfundas.repository;

import com.ar.azaharfundas.model.Funda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundaRepository extends JpaRepository<Funda, Long>{
    
}
