package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Modelo;
import java.util.List;

public interface IModeloService {
 
    public List<Modelo> verModelos();
    
    public void crearModelo(Modelo mod);
    
    public void borrarModelo(Long id);
    
    public Modelo buscarModelo(Long id);
    
    public Modelo traerModelo(Long id);
    
}
