package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    private String nombreEducacion;
    private String nombreInstitucion;

    public Educacion() {}

    public Educacion(String nombreEducacion, String nombreInstitucion) {
		this.nombreEducacion = nombreEducacion;
		this.nombreInstitucion = nombreInstitucion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreEducacion() {
		return nombreEducacion;
	}

	public void setNombreEducacion(String nombreEducacion) {
		this.nombreEducacion = nombreEducacion;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
  
}
