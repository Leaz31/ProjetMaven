package com.formation.services;

import com.formation.persistance.entities.Client;

public class Editclient {


	Client c1 = new Client();
	c1.setNom("XIV");
	c1.setId(51);
	c1.setPrenom("Louis");
	c1.setEmail("ultimaratio@regnum.fr");
	c1.setTelephone("0509163800");
	c1.setDate_naissance("1638-09-05");
	
	clientRepo.save(c1);
	

	
}
