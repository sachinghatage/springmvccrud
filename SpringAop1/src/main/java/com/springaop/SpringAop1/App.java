package com.springaop.SpringAop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.SpringAop1.dao.AccountDao;


public class App 
{
    public static void main( String[] args )
    {
        //read spring config java class
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
    	
    	//get bean
    	AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
    	
    	//call bussiness method
    	
    	accountDao.addAccount();
    	
    	//close context
    	context.close();
    }
}
