package com.backend.spring.custompokeapi.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.backend.spring.custompokeapi.models.Pokemon;
import com.backend.spring.custompokeapi.models.PokemonResponse;
import com.backend.spring.custompokeapi.models.ResponsePokemons;


public interface IPokedexService {
	
	//public List<Pokemon> listPokemonsByName(String name);
	public List<Pokemon> listPokemonsByName(String name);
	 

}
