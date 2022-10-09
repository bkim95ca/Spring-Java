package com.brandon.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brandon.dojosandninjas.models.Ninja;
import com.brandon.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	public final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	//Create 
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//Show all
	public List<Ninja> findAll() {
		return ninjaRepo.findAll();
	}

}
