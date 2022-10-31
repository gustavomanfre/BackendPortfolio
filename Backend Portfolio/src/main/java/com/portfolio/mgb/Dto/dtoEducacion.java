package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
	
    @NotBlank
    private String nombreEducacion;
    @NotBlank
    private String nombreInstitucion;
  
    public dtoEducacion() {}


    public dtoEducacion(String nombreEducacion,String nombreInstitucion) {
		this.nombreEducacion = nombreEducacion;
		this.nombreInstitucion = nombreInstitucion;
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
