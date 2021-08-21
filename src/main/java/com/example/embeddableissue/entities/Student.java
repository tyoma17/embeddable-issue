package com.example.embeddableissue.entities;

import javax.persistence.*;

import static com.example.embeddableissue.entities.Address.ADDRESSES;

@Entity
@Table(name = "STUDENTS")
@SecondaryTable(
        name = ADDRESSES,
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "STUDENT_ID")
)
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    @Embedded // not needed
    private Address address;

    public Student() {
    }

    public Student(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
