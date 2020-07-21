package com.cts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int patientId;
	private String patientName;
	private int age;
	private String patientStatus;
	private String mobileNumber;
	public Patient() {
		super();
	}
	public Patient(int patientId, String patientName, int age, String patientStatus, String mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.patientStatus = patientStatus;
		this.mobileNumber = mobileNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", patientStatus="
				+ patientStatus + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
