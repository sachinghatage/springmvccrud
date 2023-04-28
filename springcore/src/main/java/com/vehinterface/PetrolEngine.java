package com.vehinterface;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine{

	public void checkStatus() {
		// TODO Auto-generated method stub
		System.out.println("checking status petrol engine");
	}

	public void service() {
		// TODO Auto-generated method stub
		System.out.println("service given to petrol engine");
	}

}
