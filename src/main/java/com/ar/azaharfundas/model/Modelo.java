package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Modelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String marca;
    private String modelo;
    private int año;
    private String tamaño;
    private String stock;


    public Modelo() {
    }

    public Modelo(Long id, String marca, String modelo, int año, String tamaño, String stock) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tamaño = tamaño;
        this.stock = stock;
    }
    
    
}
