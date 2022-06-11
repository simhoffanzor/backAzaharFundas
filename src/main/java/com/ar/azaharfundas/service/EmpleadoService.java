package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Empleado;
import com.ar.azaharfundas.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    public EmpleadoRepository empleadoRepo;
    
    @Override
    public List<Empleado> verEmpleados() {
        return empleadoRepo.findAll();
    }

    @Override
    public void crearEmpleado(Empleado empl) {
        empleadoRepo.save(empl);
    }

    @Override
    public void borrarEmpleado(Long id) {
        empleadoRepo.deleteById(id);
    }

    @Override
    public Empleado buscarEmpleado(Long id) {
        return empleadoRepo.findById(id).orElse(null);
    }

    @Override
    public Empleado traerEmpleado(Long id) {
        return empleadoRepo.getById(id);
    }
    
}