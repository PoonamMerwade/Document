package com.cts.entity;

//import java.io.Serializable;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity(name ="hospital")
public class Hospital  {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int hospitalId ;
	
	private String hospitalName;
	
	private int bedsAvailable;
	
	
	public Hospital() {
		super();
	}
	public Hospital(int hospitalId, String hospitalName, int bedsAvailable) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.bedsAvailable = bedsAvailable;
	}
			
}





//@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="specialistId")
//private List<Specialist> specialist; 
//
//@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="patientId")
//private List<Patient> patient;
