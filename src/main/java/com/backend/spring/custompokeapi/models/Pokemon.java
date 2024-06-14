package com.backend.spring.custompokeapi.models;

import java.util.List;

import com.backend.spring.custompokeapi.models.pokemondetails.PokemonType;

public class Pokemon {
	
	private Integer order;
	private String name;
	private String img;
	private List<String> types;
	
	
	
	
	public Pokemon(Integer order, String name, String img, List<String> types) {
		super();
		this.order = order;
		this.name = name;
		this.img = img;
		this.types = types;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	
	

}
