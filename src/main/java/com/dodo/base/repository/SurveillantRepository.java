package com.dodo.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dodo.base.entity.Surveillant;

public interface SurveillantRepository extends JpaRepository<Surveillant, Integer> {

	Surveillant findById(int id);
	
}
