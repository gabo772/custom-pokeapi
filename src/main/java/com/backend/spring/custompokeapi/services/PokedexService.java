package com.backend.spring.custompokeapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backend.spring.custompokeapi.clients.PokeApiRest;
import com.backend.spring.custompokeapi.models.Pokemon;
import com.backend.spring.custompokeapi.models.pokemondetails.*;
import com.backend.spring.custompokeapi.models.PokemonResponse;
import com.backend.spring.custompokeapi.models.PokemonResult;
import com.backend.spring.custompokeapi.models.ResponsePokemons;

@Service
public class PokedexService implements IPokedexService {
	
	@Autowired
	private PokeApiRest pokeApiRest;

	@Override
	public List<Pokemon> listPokemonsByName(String name) {
		List<Pokemon> pokemons=new ArrayList<Pokemon>();
		ResponseEntity<ResponsePokemons> responsePokemons=responsePokemons=pokeApiRest.listPokemons(0, 10);
		List<PokemonResult> results = responsePokemons.getBody().getResults();
		for(PokemonResult pokemonResult:results) {
			ResponseEntity<PokemonResponse> pokeResp=pokeApiRest.getPokemonByName(pokemonResult.getName());
			PokemonResponse pokemonObjResponse=pokeResp.getBody();
			
			Pokemon poke = new Pokemon(
					pokemonObjResponse.getOrder(),
					pokemonObjResponse.getName(),
					pokemonObjResponse.getSprites().getFront_default(),
					pokemonObjResponse.getTypes().stream().map(Types::getType).map(PokemonType::getName).collect(Collectors.toList())
					);
			pokemons.add(poke);
		}
		
		

		return pokemons;
	}

	

}
