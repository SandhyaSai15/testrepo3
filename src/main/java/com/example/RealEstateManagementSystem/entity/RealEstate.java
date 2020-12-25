package com.example.RealEstateManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name= "REAL_ESTATE_TABLE")
public class RealEstate {
	
	@Id
	@GeneratedValue
	private int id;
	private String realEstateType;
	private String ownerName;
	private int areaSize;
	private double estimateCost;
	private int phoneNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRealEstateType() {
		return realEstateType;
	}
	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(int areaSize) {
		this.areaSize = areaSize;
	}
	public double getEstimateCost() {
		return estimateCost;
	}
	public void setEstimateCost(double estimateCost) {
		this.estimateCost = estimateCost;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
