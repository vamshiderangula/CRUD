package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int id;
	String name;
	String colour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}
	public Laptop(int id, String name, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
