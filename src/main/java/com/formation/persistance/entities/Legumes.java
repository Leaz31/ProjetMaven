package com.formation.persistance.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Table(name = "legumes")
	@Entity

public class Legumes {
	

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name="libelle")
		private String libelle;
		
		@Lob
		@Column(name="description",nullable = true)
		private String description;
		
		
		@Column(name="id_categorie")
		private String IdCat;


		@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "id_legumes",referencedColumnName = "id" )
		private Set<LegumesToPaniers> leg_paniers;
		

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getLibelle() {
			return libelle;
		}


		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getIdCat() {
			return IdCat;
		}


		public void setIdCat(String idCat) {
			IdCat = idCat;
		}
		
		

}