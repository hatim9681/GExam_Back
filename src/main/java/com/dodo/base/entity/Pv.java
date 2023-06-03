package com.dodo.base.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;

@Entity
public class Pv {

	@EmbeddedId
	private PvHelper id;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="etudiantId",insertable = false,updatable = false)
	private Etudiant etudiant;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="examenId",insertable = false,updatable = false)
	private Examen examen;
	private Boolean presence=false;
	public Pv() {
		super();
	}
	public PvHelper getId() {
		return id;
	}
	public void setId(PvHelper id) {
		this.id = id;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	public Boolean getPresence() {
		return presence;
	}
	public void setPresence(Boolean presence) {
		this.presence = presence;
	}
	@Override
	public int hashCode() {
		return Objects.hash(etudiant, examen, id, presence);
	}
	
	
}
