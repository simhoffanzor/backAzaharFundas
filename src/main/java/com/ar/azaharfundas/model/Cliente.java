package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String facebook;
    private String instagram;
    private String tipoCliente;
    

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido, String telefono, String direccion, String facebook, String instagram, String tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.facebook = facebook;
        this.instagram = instagram;
        this.tipoCliente = tipoCliente;
    }
    
    
}
