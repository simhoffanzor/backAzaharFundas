package com.ar.azaharfundas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private int añoInicio;
    private int añoFinal;
    private String foto;
    private String mail;
    private String telefono;
    private String direccion;
    private String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, int añoInicio, int añoFinal, String foto, String mail, String telefono, String direccion, String tipoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoInicio = añoInicio;
        this.añoFinal = añoFinal;
        this.foto = foto;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoEmpleado = tipoEmpleado;
    }
    
    
}

