package com.example.dubovtsevbd.interfaces;

import com.example.dubovtsevbd.entities.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface specialityRepository extends JpaRepository<Speciality, Long> {
}
