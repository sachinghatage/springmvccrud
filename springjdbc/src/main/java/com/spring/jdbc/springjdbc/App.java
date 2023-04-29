package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
     
		/*
		 * JdbcTemplate template=(JdbcTemplate)context.getBean("jdbcTemplate");
		 * 
		 * //insert query String query="insert into student values(?,?,?)";
		 * 
		 * int result=template.update(query,123,"Sachin","karnataka");
		 */
        
        StudentDao studentdao=(StudentDao)context.getBean("studentdao");
		/*//Inserting
		 * Student student=new Student(); student.setId(789); student.setName("rakesh");
		 * student.setCity("belgaum"); int result=studentdao.insert(student);
		 * System.out.println("query updated"+result);
		 */
        
        
		/*
		 * //Updating Student student=new Student(); student.setId(123);
		 * student.setName("akash"); student.setCity("bhopal"); int result =
		 * studentdao.change(student); System.out.println("result updated"+result);
		 */
        
        //Delete
        int result = studentdao.delete(789);
        System.out.println("deleted data"+result);
        
        
        
    }
}
