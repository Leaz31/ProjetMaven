package com.formation.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

	@Table(name = "paniers_to_commandes")
	@Entity

public class PaniersToCommandes {
	

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name="quantite")
		private String quantite;
		
		@JoinColumn(name="id_commande", referencedColumnName = "id")
		private String id_Commande;
		
		@JoinColumn(name="id_panier", referencedColumnName = "id")
		private String id_Panier;
		
	}