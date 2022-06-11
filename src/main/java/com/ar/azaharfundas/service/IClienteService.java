package com.ar.azaharfundas.service;

import com.ar.azaharfundas.model.Cliente;
import java.util.List;

public interface IClienteService {
 
    public List<Cliente> verClientes();
    
    public void crearCliente(Cliente cli);
    
    public void borrarCliente(Long id);
    
    public Cliente buscarCliente(Long id);
    
    public Cliente traerCliente(Long id);
    
}