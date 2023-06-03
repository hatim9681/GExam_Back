package com.dodo.base.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Examen;
import com.dodo.base.entity.Surveillant;
import com.dodo.base.service.ExamenService;
import com.dodo.base.service.SurveillantService;

@RestController
@RequestMapping("examen")
public class ExamenController {

	@Autowired
	private ExamenService examenService;
	@Autowired
	private SurveillantService surveillantService;
	
	@GetMapping("/date")
	public List<Examen> getExamsByDate(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
		return examenService.getExamensByDate(date);
	}
	@GetMapping("/all")
	public List<Examen> getExams(){
		return examenService.findAll();
	}
	@GetMapping("/surv/{id}")
	public List<Examen> getExamsBySurv(@PathVariable String id)
	{
		Surveillant s=surveillantService.findById(id);
		return s.getExamens();
	}
	
		@GetMapping("/etud/{id}")
	public List<Etudiant> getExamsByEtud(@PathVariable int id)
	{
		return examenService.findEtudParExam(id);	
	}
	@GetMapping("/{id}")
	public Examen getExamById(@PathVariable int id)
	{
		return examenService.findById(id);	
	}
}
	
