package com.cts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
	
}
