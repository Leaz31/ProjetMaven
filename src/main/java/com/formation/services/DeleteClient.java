package com.formation.services;

import com.formation.persistance.entities.Client;

public class DeleteClient {
	
	Client c11 = new Client();
	c11.setNom("XIV");
	c11.setId(49);
	c11.setPrenom("Louis");
	c11.setEmail("ultimaratio@regnum.fr");
	c11.setTelephone("0509163800");
	c11.setDate_naissance("1638-09-05");
	
	clientRepo.delete(c11);
	
}
