package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
@Service
public interface LaptopService {

	List<Laptop> getLaptop();

}
