package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private String logo;
    private String whatsapp;
    private String facebook;
    private String instagram;
    private String linkedin;
    private int añoCreacion;

    public Empresa() {
    }

    public Empresa(Long id, String nombre, String descripcion, String logo, String whatsapp, String facebook, String instagram, String linkedin, int añoCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.logo = logo;
        this.whatsapp = whatsapp;
        this.facebook = facebook;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.añoCreacion = añoCreacion;
    }
    
   
}
