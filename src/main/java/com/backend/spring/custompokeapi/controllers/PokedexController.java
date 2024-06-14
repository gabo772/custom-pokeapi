package com.backend.spring.custompokeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.spring.custompokeapi.models.Pokemon;
import com.backend.spring.custompokeapi.models.ResponsePokemons;
import com.backend.spring.custompokeapi.services.IPokedexService;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {
	
	@Autowired
	private IPokedexService pokedexService;
	
	@GetMapping("/pokemon")
	public ResponseEntity<List<Pokemon>> listPokemons() {
		
		return new ResponseEntity<>(pokedexService.listPokemonsByName(""),HttpStatus.OK);
	}
	

}
