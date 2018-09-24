package com.example.dubovtsevbd.controllers;

import com.example.dubovtsevbd.entities.Student;
import com.example.dubovtsevbd.interfaces.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private studentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> retrieveAllStudents() { return studentRepository.findAll(); }

}
