package com.formation.persistance.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.persistance.entities.Client;

public interface IClientRepository extends JpaRepository<Client,Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM clients WHERE nom LIKE ?1 OR prenom LIKE ?2")
	public List<Client> findByNom(String nom, String prenom);

	public Optional<Client> findById(Integer id);

	public void deleteById(Integer id);
	
	
}
