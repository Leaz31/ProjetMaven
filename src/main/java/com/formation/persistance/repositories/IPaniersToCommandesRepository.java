package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.PaniersToCommandes;

public interface IPaniersToCommandesRepository extends JpaRepository<PaniersToCommandes,Long> {
	
}
