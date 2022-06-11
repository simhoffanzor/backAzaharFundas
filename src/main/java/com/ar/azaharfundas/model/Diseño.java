package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Diseño {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String estado;
    private String imagen;
    private String tipo;

    public Diseño() {
    }

    public Diseño(Long id, String estado, String imagen, String tipo) {
        this.id = id;
        this.estado = estado;
        this.imagen = imagen;
        this.tipo = tipo;
    }
    
    
}