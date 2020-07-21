package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.cts.entity.Specialist;
import com.cts.repository.SpecialistRepository;

public class SpecialistService {
	
	@Autowired
	SpecialistRepository specialistRepository;
	
	@Cacheable("specialist")
	public List<Specialist> getAll() {
		return (List<Specialist>)specialistRepository.findAll();
	}

	public List<Specialist> getSpecialistDetailsByName(String specialistName) {
		return (List<Specialist>) specialistRepository.findByName(specialistName);
	}

	public void addSpecialist(Specialist specialist) {
		specialistRepository.save(specialist);
	}

}
