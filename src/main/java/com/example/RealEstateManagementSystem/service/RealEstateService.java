package com.example.RealEstateManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RealEstateManagementSystem.entity.RealEstate;
import com.example.RealEstateManagementSystem.repository.RealEstateRepository;

@Service
public class RealEstateService {
	@Autowired
	private RealEstateRepository repository;
	
	public RealEstate saveRealEstate(RealEstate item) {
		return repository.save(item);
	}
	
	public List<RealEstate> saveRealEstates(List<RealEstate> items) {
		return repository.saveAll(items);
	}
	public List<RealEstate> getRealEstates(){
		return repository.findAll();
	}
	public RealEstate getRealEstateById(int id) {
		return repository.findById(id).orElse(null);
	}
	public RealEstate getRealEstateByName(String realEstateType) {
		return repository.findByRealEstateType(realEstateType);
	}
	public String deleteRealEstate(int id) {
		repository.deleteById(id);
		return "Real Estate property " +id+ " is removed from the list of properties!!";
	}
	public RealEstate updateRealEstate(RealEstate realestate) {
		RealEstate existingRealEstate=repository.findById(realestate.getId()).orElse(null);
		existingRealEstate.setRealEstateType(realestate.getRealEstateType());
		existingRealEstate.setOwnerName(realestate.getOwnerName());
		existingRealEstate.setAreaSize(realestate.getAreaSize());
		existingRealEstate.setEstimateCost(realestate.getEstimateCost());
		existingRealEstate.setPhoneNumber(realestate.getPhoneNumber());
		return repository.save(existingRealEstate);
	}
}
