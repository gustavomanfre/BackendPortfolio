package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hys {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreHyS;
    private int porcentajeHyS;
    
	public hys(String nombreHyS, int porcentajeHyS) {
		this.nombreHyS = nombreHyS;
		this.porcentajeHyS = porcentajeHyS;
	}

	public hys() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
