package com.example.embeddableissue.controllers;

import com.example.embeddableissue.entities.Student;
import com.example.embeddableissue.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    @ResponseStatus(OK)
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public Student findOne(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/emptyAddress")
    @ResponseStatus(CREATED)
    public Student createStudentWithEmptyAddress() {
        return studentService.createStudentWithEmptyAddress();
    }

    @PostMapping("/nonEmptyAddress")
    @ResponseStatus(CREATED)
    public Student createStudentWithNonEmptyAddress() {
        return studentService.createStudentWithNonEmptyAddress();
    }

    @PutMapping("/{id}/emptyAddress")
    @ResponseStatus(OK)
    public Student updateStudentWithEmptyAddress(@PathVariable Long id) {
        return studentService.updateStudentWithEmptyAddress(id);
    }

    @PutMapping("/{id}/nonEmptyAddress")
    @ResponseStatus(OK)
    public Student updateStudentWithNonEmptyAddress(@PathVariable Long id) {
        return studentService.updateStudentWithNonEmptyAddress(id);
    }


}
