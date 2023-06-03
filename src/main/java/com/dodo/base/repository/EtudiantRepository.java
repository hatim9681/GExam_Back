package com.dodo.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dodo.base.entity.Etudiant;
import com.dodo.base.entity.Surveillant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

	Etudiant findById(int id);
}
