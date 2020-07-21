package com.cts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name ="hospital")
public class Hospital {
	
	@XmlElement
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int hospitalId ;
	
	@XmlElement
	private String hospitalName;
	
	@XmlElement
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
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public int getBedsAvailable() {
		return bedsAvailable;
	}
	public void setBedsAvailable(int bedsAvailable) {
		this.bedsAvailable = bedsAvailable;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", bedsAvailable="
				+ bedsAvailable + "]";
	}	
}
