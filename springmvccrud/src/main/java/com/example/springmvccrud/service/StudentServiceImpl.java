package com.example.springmvccrud.service;

import com.example.springmvccrud.entity.Student;
import com.example.springmvccrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    StudentRepository studentRepository;

    @Override
    public void save(Student student) {


            Student staffUpdate = studentRepository.findById(student.getId()).get();
            staffUpdate.setName(student.getName());
            staffUpdate.setId(student.getId());
            staffUpdate.setFee(student.getFee());
            staffUpdate.setDept(student.getDept());
            studentRepository.save(staffUpdate);

    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
