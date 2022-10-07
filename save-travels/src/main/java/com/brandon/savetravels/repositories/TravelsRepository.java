package com.brandon.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brandon.savetravels.models.Travels;

@Repository
public interface TravelsRepository extends CrudRepository<Travels, Long>{
	List<Travels> findAll();
}
