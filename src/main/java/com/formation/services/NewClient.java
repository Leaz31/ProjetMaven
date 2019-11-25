package com.formation.services;

import com.formation.persistance.entities.Client;

public class NewClient {
	
	Client c = new Client();
	c.setNom("XIV");
	c.setId(null);
	c.setPrenom("Louis");
	c.setEmail("ultimaratio@regnum.fr");
	c.setTelephone("0509163800");
	c.setDate_naissance("1638-09-05");
	
	clientRepo.save(c);

}
