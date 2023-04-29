package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
         Person p=(Person)context.getBean("person");
        // Certi c=(Certi)context.getBean("cer");
	   System.out.println(p);
	  // System.out.println(c);
	
	}

}
