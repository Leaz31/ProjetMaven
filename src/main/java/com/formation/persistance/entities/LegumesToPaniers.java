package com.formation.persistance.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

	@Table(name = "legumes_to_paniers")
	@Entity

public class LegumesToPaniers {
	

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		@JoinColumn(name="id_panier", referencedColumnName = "id")
		private String id_panier;
		
		
		@JoinColumn(name="id_legumes", referencedColumnName = "id")
		private String id_legumes;
		
	}