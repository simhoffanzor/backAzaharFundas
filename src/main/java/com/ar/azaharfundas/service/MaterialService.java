package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Material;
import com.ar.azaharfundas.repository.MaterialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService implements IMaterialService{

    @Autowired
    public MaterialRepository materialRepo;
    
    @Override
    public List<Material> verMateriales() {
        return materialRepo.findAll();
    }

    @Override
    public void crearMaterial(Material mat) {
       materialRepo.save(mat);
    }

    @Override
    public void borrarMaterial(Long id) {
        materialRepo.deleteById(id);
    }

    @Override
    public Material buscarMaterial(Long id) {
        return materialRepo.findById(id).orElse(null);
    }

    @Override
    public Material traerMaterial(Long id) {
        return materialRepo.getById(id);
    }
    
}