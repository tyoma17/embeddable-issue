package com.example.embeddableissue.services;

import com.example.embeddableissue.entities.Address;
import com.example.embeddableissue.entities.Student;
import com.example.embeddableissue.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student createStudentWithEmptyAddress() {
        Student student = new Student("Caleb", "Baker", new Address());
        return studentRepository.save(student);
    }

    public Student createStudentWithNonEmptyAddress() {
        Address address = new Address("France", "Paris", "Rue Vieille Du Temple", 88);
        Student student = new Student("Cayden", "Hoover", address);
        return studentRepository.save(student);
    }

    public Student findById(Long id) {
        return studentRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Student with id: " + id + " was not found"));
    }

    public Student updateStudentWithEmptyAddress(Long id) {
        Student student = findById(id);
        student.setAddress(new Address());
        return student;
    }

    public Student updateStudentWithNonEmptyAddress(Long id) {
        Student student = findById(id);
        Address address = new Address("USA", "New York", "Stanton Street", 17);
        student.setAddress(address);
        return student;
    }

}
