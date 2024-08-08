package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;
@Service
public class LaptopServiceimpl {
	@Autowired
	LaptopRepository laptopRepository;

	
	public List<Laptop> getLaptop() {
		return laptopRepository.findAll();

	}


	public Laptop findById(Integer n) {
		
		Optional<Laptop> laptop = laptopRepository.findById(n);
		return laptop.orElse(null);
	}


	public List<Laptop> findByName(String name) {
		// TODO Auto-generated method stub
		return laptopRepository.findByName(name);
	}


	public void save(Laptop l) {
		laptopRepository.save(l);
		
	}


	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		laptopRepository.deleteById(id);
		
	}


	


	public String updateById(Laptop l, Integer id) {
		Optional<Laptop> ols = laptopRepository.findById(id);
		if(ols.isPresent()) {
			Laptop ol = ols.get();
			ol.setName(l.getName());
			ol.setColour(l.getColour());
			laptopRepository.save(ol);
			return "success";
		}
		else {
			return "not found";
		}
		
		
	}
}
