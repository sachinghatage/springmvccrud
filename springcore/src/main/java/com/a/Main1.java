package com.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("com");
		A bean = context.getBean("a",A.class);
		A bean1 = context.getBean("a",A.class);
		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());
		System.out.println(bean.getB());
		System.out.println(bean1.getB());
		
		
//		B bean = context.getBean(B.class);
//		B bean1 = context.getBean(B.class);
//		System.out.println(bean.hashCode());
//		System.out.println(bean1.hashCode());
//		System.out.println(bean.getA());
//		System.out.println(bean1.getA());

	}

}
