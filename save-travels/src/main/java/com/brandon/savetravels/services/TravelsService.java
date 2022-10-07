package com.brandon.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brandon.savetravels.models.Travels;
import com.brandon.savetravels.repositories.TravelsRepository;

@Service
public class TravelsService{
	
	//adding the travels repo as a dependency
	public final TravelsRepository travelsRepo;
	
	public TravelsService(TravelsRepository travelsRepo) {
		this.travelsRepo = travelsRepo;
	}
	
	//Find all 
	public List<Travels> findAll() {
		return travelsRepo.findAll();
	}
	
	//Get by ID
	public Travels getOne(Long id) {
		return travelsRepo.findById(id).isPresent() ? travelsRepo.findById(id).get() : null;
	}
	
	//Create row travels
	public Travels create(Travels travels) {
		return travelsRepo.save(travels);
	}
	
	//Edit
	public Travels update(Travels travels) {
		return travelsRepo.save(travels);
	}
	
	//Delete
	public void delete(Long id) {
		travelsRepo.deleteById(id);
	}
	

}
