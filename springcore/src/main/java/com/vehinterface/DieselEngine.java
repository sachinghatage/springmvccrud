package com.vehinterface;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine{

	public void checkStatus() {
		// TODO Auto-generated method stub
		System.out.println("checking status for diesel");
	}

	public void service() {
		// TODO Auto-generated method stub
		System.out.println("service for diesel");
	}

}
