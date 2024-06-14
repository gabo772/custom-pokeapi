package com.backend.spring.custompokeapi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.backend.spring.custompokeapi.models.PokemonResponse;
import com.backend.spring.custompokeapi.models.ResponsePokemons;

@FeignClient(name="pokeApiFeign",url="https://pokeapi.co/api/v2")
public interface PokeApiRest {
	
	
	@GetMapping("/pokemon")
	public ResponseEntity<ResponsePokemons> listPokemons(@RequestParam Integer offset,@RequestParam Integer limit);
	
	@GetMapping("/pokemon/{name}")
	public ResponseEntity<PokemonResponse> getPokemonByName(@PathVariable("name")String name);

}
