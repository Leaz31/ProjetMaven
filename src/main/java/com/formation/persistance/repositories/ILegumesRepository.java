package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Legumes;

public interface ILegumesRepository extends JpaRepository<Legumes,Long> {
	
}
