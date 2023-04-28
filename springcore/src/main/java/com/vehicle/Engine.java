package com.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine(String model) {
		this.model = model;
	}

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}

}
