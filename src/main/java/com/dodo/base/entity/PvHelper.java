package com.dodo.base.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PvHelper implements Serializable {

	@Column(name="etudiantId")
	Long etudiants;
	@Column(name="examenId")
	Long examens;
	public PvHelper() {
		super();
	}
	public Long getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Long etudiants) {
		this.etudiants = etudiants;
	}
	public Long getExamens() {
		return examens;
	}
	public void setExamens(Long examens) {
		this.examens = examens;
	}
	
	
	
}
