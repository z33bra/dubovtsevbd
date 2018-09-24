package com.example.dubovtsevbd.controllers;

import com.example.dubovtsevbd.entities.Faculty;
import com.example.dubovtsevbd.interfaces.facultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class facultyController {

    @Autowired
    private facultyRepository facultyRepository;

    @GetMapping("/faculty")
    public List<Faculty> retrieveAllFaculties() { return  facultyRepository.findAll(); }

}
