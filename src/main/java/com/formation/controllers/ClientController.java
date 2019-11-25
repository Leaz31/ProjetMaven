package com.formation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.exceptions.ClientNotFoundException;
import com.formation.persistance.entities.Client;
import com.formation.persistance.repositories.IClientRepository;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	@Autowired
	IClientRepository repo;
	public ClientController() {
		System.out.println("Batman > Superman");
	}
	
	@RequestMapping(path= "/list", method = RequestMethod.GET)
	public List<Client> findAll(){
		
		return repo.findAll();
	}
	
	@GetMapping(path="/{identifiant}") //les accolades indiquent qu'on veut une variable, ici on veut un identifiant (45, 72, 123..) par écrire "identifiant"
	public Client findOne(@PathVariable(name="identifiant")  Integer id) {
		Optional<Client> opt = repo.findById(id);
		if (opt.isEmpty()) {
			throw new ClientNotFoundException("Le client " + id + " n'a pas était trouvé");
		}
		return opt.get();
	}
	
	
	@DeleteMapping(path="/{i}")
	public Boolean deleteOne(@PathVariable Integer id) {
		
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	@PostMapping
	public Client save(@RequestBody Client rc) {
		return repo.save(rc);
	}
	
	//
	
}
