package com.formation.persistance.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.persistance.entities.Commandes;

public interface ICommandesRepository extends JpaRepository<Commandes,Long> {

	@Query(nativeQuery = true, value = "select * from commandes")
	public List<Commandes> findById(String nom, String prenom);

	@Override
	@Query(value = " select * from commandes order by id_client", nativeQuery = true)
	List<Commandes> findAll();


	
	
	
}
