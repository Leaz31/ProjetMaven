package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.LegumesToPaniers;

public interface ILegumesToPaniersRepository extends JpaRepository<LegumesToPaniers,Long> {
	
}
