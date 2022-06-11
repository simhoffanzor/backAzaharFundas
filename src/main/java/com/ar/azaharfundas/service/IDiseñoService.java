package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Diseño;
import java.util.List;

public interface IDiseñoService {
 
    public List<Diseño> verDiseños();
    
    public void crearDiseño(Diseño dis);
    
    public void borrarDiseño(Long id);
    
    public Diseño buscarDiseño(Long id);
    
    public Diseño traerDiseño(Long id);
    
}