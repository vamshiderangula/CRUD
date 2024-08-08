package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
import com.example.demo.serviceimpl.LaptopServiceimpl;

@RestController
public class LaptopController {
	@Autowired
	LaptopServiceimpl laptopService;
	@GetMapping(value = "/get")
	public List<Laptop> get(){
		return laptopService.getLaptop();
	}
	@GetMapping(value = "/getById/{id}")
	public Laptop findById(@PathVariable Integer id) {
	return	laptopService.findById(id);
	}
	@GetMapping(value = "/getByName/{name}")
	public List<Laptop> findByName(@PathVariable String name) {
	return	laptopService.findByName(name);
	}
	@PostMapping(value = "/post")
	public String post(@RequestBody Laptop l) {
	    laptopService.save(l);
	    return "succes";
	}
	
	@DeleteMapping(value = "/deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		laptopService.deleteById(id);
		return "deleted";
	
	}
	@PutMapping(value = "/updateById/{id}")
	public String updateById(@RequestBody Laptop l,@PathVariable Integer id) {
		return  laptopService. updateById(l,id);
		
	
	}
	

}
