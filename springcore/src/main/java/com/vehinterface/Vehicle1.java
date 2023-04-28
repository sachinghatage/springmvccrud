package com.vehinterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle1 {

	int id;
	String model;
	
	//@Autowired
    //@Qualifier("petrol")
	IEngine e;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public IEngine getE() {
		return e;
	}

	public void setE(IEngine e) {
		this.e = e;
	}

	public Vehicle1() {
		super();
		// TODO Auto-generated constructor stub
	}

      @Autowired
	public Vehicle1(@Value("10")int id,@Value("bmw") String model,@Qualifier("petrol") IEngine e) {
		super();
		this.id = id;
		this.model = model;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Vehicle1 [id=" + id + ", model=" + model + ", e=" + e + "]";
	}
      
      
	
}
