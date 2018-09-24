package com.example.dubovtsevbd.controllers;

import com.example.dubovtsevbd.entities.Speciality;
import com.example.dubovtsevbd.interfaces.specialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class specialityController {

    @Autowired
    private specialityRepository specialityRepository;

    @GetMapping("/speciality")
    public List<Speciality> retrieveAllSpecialities () { return specialityRepository.findAll(); }

}
