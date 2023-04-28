package com.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vehicle {

	@Autowired
	private Engine e;
	
	private String model;
	private int id;
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Autowired
	public Vehicle(@Value("petrol")Engine e,@Value("petrol") String model,@Value("10") int id) {
		super();
		this.e = e;
		this.model = model;
		this.id = id;
	}
	
	public Vehicle() {
		super();
	}
	@Override
	public String toString() {
		return "Vehicle [e=" + e + ", model=" + model + ", id=" + id + "]";
	}
	
	
	
	
	
	
}
