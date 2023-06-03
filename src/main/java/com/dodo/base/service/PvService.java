package com.dodo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Examen;
import com.dodo.base.entity.Pv;
import com.dodo.base.repository.EtudiantRepository;
import com.dodo.base.repository.ExamenRepository;
import com.dodo.base.repository.PvRepository;

import Idao.Idao;
@Service
public class PvService implements Idao<Pv> {

	@Autowired
	private PvRepository pvR;

	@Override
	public List<Pv> findAll() {
		
		return pvR.findAll();
	}
	public void update(int exa,int etu)
	{
		for(Pv pv:pvR.findAll())
		{
			if(pv.getEtudiant().getId()==etu && pv.getExamen().getId()==exa)
			{
				pv.setPresence(true);
			}
		}
		
	}
	public Pv createPv(Pv pv) {
		return pvR.save(pv);
	}
	public Pv findByIds(int id1,int id2)
	{
		for(Pv p:pvR.findAll())
		{
			if(p.getExamen().getId()==id1 && p.getEtudiant().getId()==id2)
			{
				return p;
			}
		}
		return null;
	}
	
}
