package com.formation.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.persistance.entities.Categories;

public interface ICategoriesRepository extends JpaRepository<Categories,Long> {
	
}
