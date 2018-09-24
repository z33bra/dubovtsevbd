package com.example.dubovtsevbd.controllers;

import com.example.dubovtsevbd.entities.Marks;
import com.example.dubovtsevbd.interfaces.marksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class marksController {

    @Autowired
    private marksRepository marksRepository;

    @GetMapping("/marks")
    public List<Marks> retrieveAllMarks () { return marksRepository.findAll(); }

}
