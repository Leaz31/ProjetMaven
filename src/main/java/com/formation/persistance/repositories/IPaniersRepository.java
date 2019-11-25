package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Paniers;

public interface IPaniersRepository extends JpaRepository<Paniers,Long> {
	
}
