package com.vehinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vehicle.Engine;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("com.vehinterface");
		Vehicle1 v = context.getBean(Vehicle1.class);
		
		
		
		System.out.println(v);
	}

}
