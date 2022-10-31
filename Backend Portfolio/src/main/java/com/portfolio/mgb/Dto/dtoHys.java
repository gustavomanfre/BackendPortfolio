/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
	
    @NotBlank
    private String nombreHyS;
    
    @NotBlank
    private int porcentajeHyS;

	public dtoHys(String nombreHyS, int porcentajeHyS) {
		this.nombreHyS = nombreHyS;
		this.porcentajeHyS = porcentajeHyS;
	}

	public dtoHys() {}

	public String getNombreHyS() {
		return nombreHyS;
	}

	public void setNombreHyS(String nombreHyS) {
		this.nombreHyS = nombreHyS;
	}

	public int getPorcentajeHyS() {
		return porcentajeHyS;
	}

	public void setPorcentajeHyS(int porcentajeHyS) {
		this.porcentajeHyS = porcentajeHyS;
	}
	
}
