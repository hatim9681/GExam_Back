package com.dodo.base.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dodo.base.entity.Pv;
import com.dodo.base.service.PvService;

@RestController
@RequestMapping("pv")
public class PvController {

	@Autowired
	private PvService pvs;
	@GetMapping("/all")
	public List<Pv> findAll()
	{
		return pvs.findAll();
	}
	@PutMapping("/update/exa/{id1}/etu/{id2}")
	public Pv update(@PathVariable int id1,@PathVariable int id2)
	{
		Pv p=pvs.findByIds(id1, id2);
		p.setPresence(true);
		return pvs.createPv(p);
	}
	@GetMapping("exa/{id}")
	public List<Pv> findByExam(@PathVariable int id)
	{
		List<Pv> pvt=new ArrayList<Pv>();
		for(Pv p:pvs.findAll())
		{
			if(p.getExamen().getId()==id)
			{
				pvt.add(p);
			}
		}
		return pvt;
	}
}
