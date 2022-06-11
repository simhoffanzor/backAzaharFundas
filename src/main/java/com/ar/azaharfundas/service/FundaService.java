package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Funda;
import com.ar.azaharfundas.repository.FundaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundaService implements IFundaService{

    @Autowired
    public FundaRepository fundaRepo;
    
    @Override
    public List<Funda> verFundas() {
        return fundaRepo.findAll();
    }

    @Override
    public void crearFunda(Funda fun) {
        fundaRepo.save(fun);
    }

    @Override
    public void borrarFunda(Long id) {
        fundaRepo.deleteById(id);
    }

    @Override
    public Funda buscarFunda(Long id) {
        return fundaRepo.findById(id).orElse(null);
    }

    @Override
    public Funda traerFunda(Long id) {
        return fundaRepo.getById(id);
    }
    
}