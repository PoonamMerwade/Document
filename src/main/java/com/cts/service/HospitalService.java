package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Hospital;
import com.cts.repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepository;

	public List<Hospital> getAll() {
		return (List<Hospital>) hospitalRepository.findAll();
	}

	public List<Hospital> bedCount() {
		List<Hospital> beds= (List<Hospital>) hospitalRepository.getBeds(0);
		for(Hospital hospital:beds){
			if(hospital.getBedsAvailable()==0){
				System.out.println("No beds available");			}
			}
			return beds;
	}
}
