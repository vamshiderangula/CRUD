package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer>{
	@Query("SELECT s FROM Laptop s WHERE s.name= :name")
	List<Laptop> findByName(String name);

	

}
