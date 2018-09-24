package com.example.dubovtsevbd.interfaces;

import com.example.dubovtsevbd.entities.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface marksRepository extends JpaRepository<Marks, Long> {
}
