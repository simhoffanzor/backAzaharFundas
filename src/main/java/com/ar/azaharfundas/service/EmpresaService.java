package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Empresa;
import com.ar.azaharfundas.repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService implements IEmpresaService{

    @Autowired
    public EmpresaRepository empresaRepo;
    
    @Override
    public List<Empresa> verEmpresa() {
        return empresaRepo.findAll();
    }

    @Override
    public void crearEmpresa(Empresa emp) {
        empresaRepo.save(emp);
    }

    @Override
    public void borrarEmpresa(Long id) {
        empresaRepo.deleteById(id);
    }

    @Override
    public Empresa buscarEmpresa(Long id) {
        return empresaRepo.findById(id).orElse(null);
    }

    @Override
    public Empresa traerEmpresa(Long id) {
        return empresaRepo.getById(id);
    }
    
}

