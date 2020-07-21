package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.entity.Patient;
import com.cts.repository.PatientRepository;

@Service
public class PatientService {
	
	PatientRepository patientRepository;

	public void addPatient(Patient patient) {
		patientRepository.save(patient);		
	}

	public void deletePatient(int patientId) {
		patientRepository.deleteById(patientId);
		
	}

	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
		
	}
	
	
	
}
