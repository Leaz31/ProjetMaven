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

	@Table(name = "paniers")
	@Entity

public class Paniers {
	

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name="debut")
		private String debut;
		
		@Lob
		@Column(name="fin")
		private String fin;
		
		
		@Column(name="prix")
		private String prix;
		

		@Column(name="qte-dispo")
		private String quantite;
		

		@Column(name="titre_panier")
		private String titre;

		@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "id_panier",referencedColumnName = "id" )
		private Set<LegumesToPaniers> legumes;
		
		@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "id_panier",referencedColumnName = "id" )
		private Set<PaniersToCommandes> pan_paniers;
		

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getDebut() {
			return debut;
		}


		public void setDebut(String debut) {
			this.debut = debut;
		}


		public String getFin() {
			return fin;
		}


		public void setFin(String fin) {
			this.fin = fin;
		}


		public String getPrix() {
			return prix;
		}


		public void setPrix(String prix) {
			this.prix = prix;
		}


		public String getQuantite() {
			return quantite;
		}


		public void setQuantite(String quantite) {
			this.quantite = quantite;
		}


		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
		}
		
	

}