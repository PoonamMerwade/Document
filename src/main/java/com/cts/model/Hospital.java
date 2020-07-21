package com.cts.model;

public class Hospital {
	private int hospitalId;
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
}
