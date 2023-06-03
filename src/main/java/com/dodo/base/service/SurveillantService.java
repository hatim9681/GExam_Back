package com.dodo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Surveillant;
import com.dodo.base.repository.SurveillantRepository;

import Idao.Idao;

@Service
public class SurveillantService implements Idao<Surveillant> {

	@Autowired
	private SurveillantRepository surveillantRepository;

	@Override
	public List<Surveillant> findAll() {
		return surveillantRepository.findAll();
	}
	
	public Surveillant findById(String id)
	{
		Surveillant surv =surveillantRepository.findById(Integer.parseInt(id));
		return surv;
	}
}
