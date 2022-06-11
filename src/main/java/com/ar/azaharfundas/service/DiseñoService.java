package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Diseño;
import com.ar.azaharfundas.repository.DiseñoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseñoService implements IDiseñoService{

    @Autowired
    public DiseñoRepository diseñoRepo;
    
    @Override
    public List<Diseño> verDiseños() {
        return diseñoRepo.findAll();
    }

    @Override
    public void crearDiseño(Diseño dis) {
       diseñoRepo.save(dis);
    }

    @Override
    public void borrarDiseño(Long id) {
        diseñoRepo.deleteById(id);
    }

    @Override
    public Diseño buscarDiseño(Long id) {
        return diseñoRepo.findById(id).orElse(null);
    }

    @Override
    public Diseño traerDiseño(Long id) {
        return diseñoRepo.getById(id);
    }
    
}