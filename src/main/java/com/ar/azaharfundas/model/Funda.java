package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Funda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String estado;
    private String fechaPedida;
    private String fechaEntregada;
    private String material;
    private int precio;
    private String imagen;
    private String modelo;

    public Funda() {
    }

    public Funda(Long id, String estado, String fechaPedida, String fechaEntregada, String material, int precio, String imagen, String modelo) {
        this.id = id;
        this.estado = estado;
        this.fechaPedida = fechaPedida;
        this.fechaEntregada = fechaEntregada;
        this.material = material;
        this.precio = precio;
        this.imagen = imagen;
        this.modelo = modelo;
    }
    
   
}

