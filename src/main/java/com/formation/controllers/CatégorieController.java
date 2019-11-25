package com.formation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/categorie")
public class CatégorieController {

	public CatégorieController() {
		System.out.println("Batman > Superman");
	}
}
