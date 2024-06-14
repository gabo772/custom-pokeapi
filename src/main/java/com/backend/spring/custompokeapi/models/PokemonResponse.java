package com.backend.spring.custompokeapi.models;

import java.util.List;

import com.backend.spring.custompokeapi.models.pokemondetails.PokemonSprite;
import com.backend.spring.custompokeapi.models.pokemondetails.Types;

public class PokemonResponse {
	
	private String name;
	private Integer order;
	private PokemonSprite sprites;
	private List<Types> types;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public PokemonSprite getSprites() {
		return sprites;
	}
	public void setSprites(PokemonSprite sprites) {
		this.sprites = sprites;
	}
	public List<Types> getTypes() {
		return types;
	}
	public void setTypes(List<Types> types) {
		this.types = types;
	}
	
	
	

}
