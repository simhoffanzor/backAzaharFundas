package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Cliente;
import com.ar.azaharfundas.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    public ClienteRepository clienteRepo;
    
    @Override
    public List<Cliente> verClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public void crearCliente(Cliente cli) {
       clienteRepo.save(cli);
    }

    @Override
    public void borrarCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public Cliente traerCliente(Long id) {
        return clienteRepo.getById(id);
    }
    
}
