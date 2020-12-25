package com.example.RealEstateManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RealEstateManagementSystem.entity.RealEstate;
import com.example.RealEstateManagementSystem.service.RealEstateService;

@RestController

public class RealEstateController {
	
	@Autowired
	private RealEstateService service;
	
	@PostMapping("/addItem")
	public RealEstate addRealEstate(@RequestBody RealEstate item) {
		return service.saveRealEstate(item);
	}
	@PostMapping("/addRealEstates")
	public List<RealEstate> addRealEstates(@RequestBody List<RealEstate> realestates) {
		return service.saveRealEstates(realestates);
	}
	@GetMapping("/realEstate")
	public List<RealEstate> findAllRealEstates(){
		return service.getRealEstates();
	}
	@GetMapping("/realEstateById/{id}")
	public RealEstate findRealEstateById(@PathVariable int id) {
		return service.getRealEstateById(id);
	}
	@GetMapping("/realEstate/{realEstateType}")
	public RealEstate findRealEstateByName(@PathVariable String realEstateType) {
		return service.getRealEstateByName(realEstateType);
	}
	@PutMapping("/update")
	public RealEstate updateRealEstate(@RequestBody RealEstate item) {
		return service.updateRealEstate(item);
	}
	@DeleteMapping("delete/{id}")
	public String deleteRealEstate(@PathVariable int id) {
		return service.deleteRealEstate(id);
	}
}
