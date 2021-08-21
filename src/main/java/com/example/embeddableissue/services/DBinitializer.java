package com.example.embeddableissue.services;

import com.example.embeddableissue.entities.Student;
import com.example.embeddableissue.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBinitializer {
    private static final Logger logger = LoggerFactory.getLogger(DBinitializer.class);

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void initDB() {
        logger.info("Starting database initialization");

//        Address address1 = new Address("USA", "New York", "Stanton Street", 17);
//        Address address2 = new Address("France", "Paris", "Rue Vieille Du Temple", 88);
//        Address address3 = new Address("Russia", "Moscow", "Tverskaya Ulitsa", 103);

//        Student student1 = new Student("Evan", "Fuentes", address1);
//        Student student2 = new Student("Aliyah", "Wiggins", address2);
//        Student student3 = new Student("Allyson", "Noble", address3);

        Student student1 = new Student("Evan", "Fuentes");
        Student student2 = new Student("Aliyah", "Wiggins");
        Student student3 = new Student("Allyson", "Noble");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

        logger.info("Database initialization finished");
    }
}
