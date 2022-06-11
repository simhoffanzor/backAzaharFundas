package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Material;
import java.util.List;

public interface IMaterialService {
 
    public List<Material> verMateriales();
    
    public void crearMaterial(Material mat);
    
    public void borrarMaterial(Long id);
    
    public Material buscarMaterial(Long id);
    
    public Material traerMaterial(Long id);
    
}