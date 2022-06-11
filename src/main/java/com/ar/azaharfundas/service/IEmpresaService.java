package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Empresa;
import java.util.List;

public interface IEmpresaService {
 
    public List<Empresa> verEmpresa();
    
    public void crearEmpresa(Empresa est);
    
    public void borrarEmpresa(Long id);
    
    public Empresa buscarEmpresa(Long id);
    
    public Empresa traerEmpresa(Long id);
    
}
