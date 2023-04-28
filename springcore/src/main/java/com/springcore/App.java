package com.springcore;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {

     ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Student bean = (Student) context.getBean("student");
       System.out.println(bean);



    }
}
