package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Modelo;
import com.ar.azaharfundas.repository.ModeloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloService implements IModeloService{

    @Autowired
    public ModeloRepository modeloRepo;
    
    @Override
    public List<Modelo> verModelos() {
        return modeloRepo.findAll();
    }

    @Override
    public void crearModelo(Modelo mod) {
       modeloRepo.save(mod);
    }

    @Override
    public void borrarModelo(Long id) {
        modeloRepo.deleteById(id);
    }

    @Override
    public Modelo buscarModelo(Long id) {
        return modeloRepo.findById(id).orElse(null);
    }

    @Override
    public Modelo traerModelo(Long id) {
        return modeloRepo.getById(id);
    }
    
}
