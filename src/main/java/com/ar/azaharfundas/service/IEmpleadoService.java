package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Empleado;
import java.util.List;

public interface IEmpleadoService {
 
    public List<Empleado> verEmpleados();
    
    public void crearEmpleado(Empleado empl);
    
    public void borrarEmpleado(Long id);
    
    public Empleado buscarEmpleado(Long id);
    
    public Empleado traerEmpleado(Long id);
    
}