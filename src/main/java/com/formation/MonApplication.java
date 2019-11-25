package com.formation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.formation.persistance.repositories.IClientRepository;
import com.formation.persistance.repositories.ICommandesRepository;


@SpringBootApplication
public class MonApplication implements CommandLineRunner {
	
	@Autowired
	private IClientRepository clientRepo;
	
	@Autowired
	private ICommandesRepository commandesRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		clientRepo.findAll().stream().forEach(c -> System.out.println(c.toString()));
		commandesRepo.findAll().stream().forEach(c -> System.out.println(c.toString()));
		
		//commandesRepo.findAll().stream()
			//.sorted((c1,c2) -> c1.getClient().getNom().compareTo(c2.getClient().getNom()))
			//.forEach(c -> System.out.println(c.toString()));
		
	}
	
		

}