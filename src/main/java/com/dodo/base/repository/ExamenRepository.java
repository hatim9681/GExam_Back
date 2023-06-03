package com.dodo.base.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Integer> {

	@Query("select e from Examen e where e.dateExamen=:d")
	List<Examen> findByDate(@Param("d") LocalDate d);
	Examen findById(int id);
	
}
