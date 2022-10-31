package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Experiencia {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreExperiencia;
    private String nombreEmpresa;
    private String tipoExperiencia;
    
    public Experiencia() {}

	public Experiencia(String nombreExperiencia, String nombreEmpresa, String tipoExperiencia) {
		this.nombreExperiencia = nombreExperiencia;
		this.nombreEmpresa = nombreEmpresa;
		this.tipoExperiencia = tipoExperiencia;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getNombreExperiencia() {
		return nombreExperiencia;
	}

	public void setNombreExperiencia(String nombreExperiencia) {
		this.nombreExperiencia = nombreExperiencia;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTipoExperiencia() {
		return tipoExperiencia;
	}

	public void setTipoExperiencia(String tipoExperiencia) {
		this.tipoExperiencia = tipoExperiencia;
	}
    
}
