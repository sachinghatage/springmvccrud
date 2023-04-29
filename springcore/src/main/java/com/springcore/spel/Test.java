package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo demo=(Demo)context.getBean("demo");
		System.out.println(demo);
		
		
           //spel expression language
		/*
		 * SpelExpressionParser temp=new SpelExpressionParser();
		 * org.springframework.expression.Expression
		 * expression=temp.parseExpression("11+11");
		 * System.out.println(expression.getValue());
		 * 
		 */		
	}

}
