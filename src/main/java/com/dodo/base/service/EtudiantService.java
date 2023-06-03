package com.dodo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dodo.base.entity.Etudiant;
import com.dodo.base.repository.EtudiantRepository;

import Idao.Idao;
@Service
public class EtudiantService implements Idao<Etudiant> {

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Override
	public List<Etudiant> findAll() {
		return etudiantRepository.findAll();
	}
	public Etudiant findById(String id)
	{
		Etudiant etud = etudiantRepository.findById(Integer.parseInt(id));
		return etud;
	}
	public Etudiant findByNum(String id) {
		for(Etudiant e:etudiantRepository.findAll()) {
		if(e.getNum_appo().equals(id)) {
			return e;
		}
		}
		return null;
	}
}
