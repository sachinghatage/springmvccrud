package com.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A {
	A(){}
	@Autowired
	B b;
   
	@Lookup  //lookup method injection
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
}