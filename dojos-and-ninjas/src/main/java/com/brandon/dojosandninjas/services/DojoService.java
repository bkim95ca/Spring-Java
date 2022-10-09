package com.brandon.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.brandon.dojosandninjas.models.Dojo;
import com.brandon.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	public final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	//find all
	public List<Dojo> findAll() {
		return dojoRepo.findAll();
	}
	
	//create
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	//find by id
	public Dojo getDojo(Long id) {
		Optional<Dojo> potentialUser = dojoRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}	

}
