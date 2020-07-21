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
@Entity(name="specialist")
public class Specialist {
	
	@XmlElement
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int specialistId;
	
	@XmlElement
	private String specialistName;
	
	@XmlElement
	private String type;
	
	@XmlElement
	private String availableTime;
	
	@XmlElement
	private String availableDay;
	
	@XmlElement
	private String isAvailable;
	
	public Specialist() {
		super();
	}
	public Specialist(int specialistId, String specialistName, String type, String availableTime, String availableDay,
			String isAvailable) {
		super();
		this.specialistId = specialistId;
		this.specialistName = specialistName;
		this.type = type;
		this.availableTime = availableTime;
		this.availableDay = availableDay;
		this.isAvailable = isAvailable;
	}
	public int getSpecialistId() {
		return specialistId;
	}
	public void setSpecialistId(int specialistId) {
		this.specialistId = specialistId;
	}
	public String getSpecialistName() {
		return specialistName;
	}
	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	public String getAvailableDay() {
		return availableDay;
	}
	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Specialist [specialistId=" + specialistId + ", specialistName=" + specialistName + ", type=" + type
				+ ", availableTime=" + availableTime + ", availableDay=" + availableDay + ", isAvailable=" + isAvailable
				+ "]";
	}
	
}
