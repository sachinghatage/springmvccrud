package com.spring.jdbc.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private	JdbcTemplate jdbcTemplate;

	
	public int insert(Student student) {
     //inserting data
        String query="insert into student values(?,?,?)";
       int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//-------------------------------------------------------------------------------------//
	
	public int change(Student student) {
// updating data
		String query="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return r;
	}


//----------------------------------------------------------------------------------------//	
	
	public int delete(int studentid) {
		//deleting data
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentid);
		return r;
	}

	
	
}
