package com.dodo.base.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dateExamen;
	private String heureDebut;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	private Surveillant surveillant;
	private String salle ;
	private String matiere;
	@OneToMany(mappedBy = "examen")
	@JsonBackReference
	private List<Pv> pvs;
	
	public Examen() {
		super();
	}
	public int getId() {
		return id;
	}
	


	public List<Pv> getPvs() {
		return pvs;
	}
	public void setPvs(List<Pv> pvs) {
		this.pvs = pvs;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateExamen() {
		return dateExamen;
	}
	public void setDateExamen(String dateExamen) {
		this.dateExamen = dateExamen;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Surveillant getSurveillant() {
		return surveillant;
	}
	public void setSurveillant(Surveillant surveillant) {
		this.surveillant = surveillant;
	}


	
	
	
}
