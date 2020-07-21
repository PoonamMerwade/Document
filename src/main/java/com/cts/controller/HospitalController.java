package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Hospital;
import com.cts.entity.Patient;
import com.cts.entity.Specialist;
import com.cts.service.HospitalService;
import com.cts.service.PatientService;
import com.cts.service.SpecialistService;

@RestController
public class HospitalController {

	@Autowired
	HospitalService hospitalService;
	
	@Autowired
	SpecialistService specialistService;
	
	@Autowired
	PatientService patientService;

	//controller for specialist
	@RequestMapping("/specialist")
	public List<Specialist> getAll(){
		return (List<Specialist>) specialistService.getAll();		
	}
	
	@GetMapping("/specialist/{specialistByName}")
	public List<Specialist> getSpecialistDetailsByName(@PathVariable String specialistName){
		return specialistService.getSpecialistDetailsByName(specialistName);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/specialist/add")
	public void addSpecialist(@RequestBody Specialist specialist){
		specialistService.addSpecialist(specialist);
	}
	
	//controller for hospital 
	@RequestMapping("/hospital")
	public List<Hospital> getAllHospitalDetails(){
		return (List<Hospital>) hospitalService.getAll();
	}
	
	@RequestMapping("/hospital/beds")
	public List<Hospital> getBedsAvailable(@PathVariable int bedsAvailable){
		return hospitalService.bedCount();
	}
	
	//controller for patient
	@RequestMapping(method=RequestMethod.POST,value="/patient/add")
	public void addPatient(@RequestBody Patient patient){
		patientService.addPatient(patient);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/patient/{patientId}")
	void deletePatientById(@PathVariable int patientId){
		patientService.deletePatient(patientId);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/patient/update/{patientId}")
	public void updatePatientById(@RequestBody Patient patient){
		patientService.updatePatient(patient);
	}
}
