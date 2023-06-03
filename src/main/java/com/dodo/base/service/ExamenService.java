package com.dodo.base.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Examen;
import com.dodo.base.entity.Pv;
import com.dodo.base.entity.Surveillant;
import com.dodo.base.repository.EtudiantRepository;
import com.dodo.base.repository.ExamenRepository;

import Idao.Idao;

@Service
public class ExamenService implements Idao<Examen> {

	@Autowired
	private ExamenRepository examenRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	public List<Examen> getExamensByDate(LocalDate date){
		return examenRepository.findByDate(date);
	}
	@Override
	public List<Examen> findAll() {
		return examenRepository.findAll();
	}
	public List<Etudiant>findEtudParExam(int id)
	{
		List<Etudiant> etudiants=new ArrayList<Etudiant>();
		for(Examen e:examenRepository.findAll())
		{
			if(e.getId()==id)
			{
				for(Pv pv:e.getPvs())
				{
					etudiants.add(pv.getEtudiant());
				}
				return etudiants;
			}
			
		}
		return null;
	}
	public Examen findById(int id)
	{
		Examen ex =examenRepository.findById(id);
		return ex;
	}
}
