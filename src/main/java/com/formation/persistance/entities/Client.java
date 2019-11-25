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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "clients")
@Entity


public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String email;
	
	@Column
	private String telephone;
	
	@Column
	private String date_naissance;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_client",referencedColumnName = "id" )
	private Set<Commandes> client;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer i) {
		this.id = i;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	
	public String toString() {
		return "Clients : " + this.getId() + " " + this.getNom() + " " + this.getPrenom() + " " + this.getEmail() + " " + this.getTelephone() + " " + this.getDate_naissance();
	}
	

	

}
