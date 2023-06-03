package com.dodo.base.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Examen;
import com.dodo.base.entity.Pv;
import com.dodo.base.service.EtudiantService;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {

	@Autowired
	private EtudiantService etudiantService;
	
	@GetMapping("/all")
	public List<Etudiant>findAll()
	{
		return etudiantService.findAll();
	}
	@GetMapping("/{id}")
	public Etudiant findById(@PathVariable String id)
	{
		return etudiantService.findById(id);
	}
	@GetMapping("/{id}/examens")
	public List<Examen> findExamsById(@PathVariable String id)
	{
		Etudiant etud=etudiantService.findById(id);
		List<Examen>exams=new ArrayList<Examen>();
		for(Pv pv:etud.getPvs())
		{
			exams.add(pv.getExamen());
		}
		return exams;
	}
	@GetMapping("/num/{id}")
	public Etudiant findByName(@PathVariable String id)
	{
		return etudiantService.findByNum(id);
	}
}
