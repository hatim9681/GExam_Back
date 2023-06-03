package com.dodo.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Surveillant;
import com.dodo.base.service.SurveillantService;

@RestController
@RequestMapping("surveillant")
public class SurveillantController {

	@Autowired
	private SurveillantService surveillantService;
	@GetMapping("/all")
	public List<Surveillant> findAll()
	{
		return surveillantService.findAll();
	}
	@GetMapping("/{id}")
	public Surveillant findById(@PathVariable String id)
	{
		return surveillantService.findById(id);
	}
}
