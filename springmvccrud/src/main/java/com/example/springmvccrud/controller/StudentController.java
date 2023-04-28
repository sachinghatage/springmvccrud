package com.example.springmvccrud.controller;

import com.example.springmvccrud.entity.Student;
import com.example.springmvccrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ModelAndView getAllStudents() {
        ModelAndView mav = new ModelAndView("index");
        List<Student> studentList = studentService.getAll();
        mav.addObject("students", studentList);
        return mav;
    }


    @GetMapping("/addstudent")
    public ModelAndView addStudent() {
        ModelAndView mav = new ModelAndView("add_student");
        mav.addObject("command", new Student());
        return mav;
    }

    @PostMapping("/savestudent")
    public String saveStaff(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    @GetMapping("/studentupdate/{id}")
    public ModelAndView getStaff(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView("add_student");
        Student student = studentService.getById(id);
        mav.addObject("command", student);
        return mav;
    }

    @GetMapping("/studentdelete/{id}")
    public String deleteStaff(@PathVariable("id") Integer id) {
        Student deleteStaff = studentService.getById(id);
        studentService.delete(deleteStaff);
        return "redirect:/";
    }

}
