package com.cts.entity;

import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity(name="specialist")
public class Specialist{
	

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int specialistId;
	
	private String specialistName;
	
	private String type;
	
	private String availableTime;
	
	private String availableDay;
	
	public Specialist() {
		super();
	}
	public Specialist(int specialistId, String specialistName, String type, String availableTime, String availableDay) {
		super();
		this.specialistId = specialistId;
		this.specialistName = specialistName;
		this.type = type;
		this.availableTime = availableTime;
		this.availableDay = availableDay;
//		this.hospital=hospital;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//@ManyToOne(cascade=CascadeType.ALL)
//@JoinColumn(name="hospitalId")
//private List<Hospital> hospital;
	
	
	
	
	
//	public int getSpecialistId() {
//		return specialistId;
//	}
//	public void setSpecialistId(int specialistId) {
//		this.specialistId = specialistId;
//	}
//	public String getSpecialistName() {
//		return specialistName;
//	}
//	public void setSpecialistName(String specialistName) {
//		this.specialistName = specialistName;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getAvailableTime() {
//		return availableTime;
//	}
//	public void setAvailableTime(String availableTime) {
//		this.availableTime = availableTime;
//	}
//	public String getAvailableDay() {
//		return availableDay;
//	}
//	public void setAvailableDay(String availableDay) {
//		this.availableDay = availableDay;
//	}

	
