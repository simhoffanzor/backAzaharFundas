package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Funda;
import java.util.List;

public interface IFundaService {
 
    public List<Funda> verFundas();
    
    public void crearFunda(Funda fun);
    
    public void borrarFunda(Long id);
    
    public Funda buscarFunda(Long id);
    
    public Funda traerFunda(Long id);
    
}
