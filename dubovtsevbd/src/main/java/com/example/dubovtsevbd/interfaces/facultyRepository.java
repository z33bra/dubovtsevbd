package com.example.dubovtsevbd.interfaces;

import com.example.dubovtsevbd.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface facultyRepository extends JpaRepository<Faculty, Long> {
}
