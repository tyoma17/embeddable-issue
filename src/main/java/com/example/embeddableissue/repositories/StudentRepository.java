package com.example.embeddableissue.repositories;

import com.example.embeddableissue.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
