package com.example.RealEstateManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RealEstateManagementSystem.entity.RealEstate;

public interface RealEstateRepository extends JpaRepository<RealEstate,Integer> {
	RealEstate findByRealEstateType(String realEstateType);
}
