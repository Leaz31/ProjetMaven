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


@Table(name = "commandes")
@Entity
	
	
public class Commandes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "montant_HT")
	private Float montant;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_panier",referencedColumnName = "id" )
	private Set<PaniersToCommandes> commandes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getMontant_HT() {
		return montant;
	}

	public void setMontant_HT(Float montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Commandes : id = " + id + " , date = " + date + " , montant = " + montant + " ";
	}
	
	//public List<Commandes> findCommandes(Client client, ICommandesRepository commandesRepo){
		//final List<Commandes> listeCommandes = commandesRepo.findAll().stream().filter(com -> com.getClient()  == client ).collect(Collectors.toList());
		//
		//return listeCommandes;
		
	//}
	
}
