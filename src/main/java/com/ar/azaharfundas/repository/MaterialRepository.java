package com.ar.azaharfundas.repository;

import com.ar.azaharfundas.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long>{
    
}
