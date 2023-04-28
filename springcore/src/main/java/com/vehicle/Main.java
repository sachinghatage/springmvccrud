package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("com.vehicle");
		Vehicle v = context.getBean(Vehicle.class);
	//	Vehicle v1=context.getBean(Vehicle.class);
		Engine e=new Engine("petrol");
		//e.setModel("petrol");
		
		//Vehicle v11=new Vehicle(e,"bmw",102);
//		v1.setE(e);
//		v1.setId(102);
//		v1.setModel("bmw");
	//	System.out.println(v1.hashCode()+"  "+v.hashCode());
		System.out.println(v);
	}

}
