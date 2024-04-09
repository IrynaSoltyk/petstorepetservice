package com.chtrembl.petstore.pet.model;

import java.util.List;

import com.chtrembl.petstore.pet.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("data")
public class DataPreload {

	@Autowired
	private PetService petService;

	//private List<Pet> pets = new ArrayList<>();

	public List<Pet> getPets() {
		return petService.getPets();
	}

	public void setPets(List<Pet> pets) {
		//this.pets = pets;
	}
}