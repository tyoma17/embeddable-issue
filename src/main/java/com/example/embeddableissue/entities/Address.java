package com.example.embeddableissue.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    public static final String ADDRESSES = "ADDRESSES";

    @Column(table = ADDRESSES)
    private String country;
    @Column(table = ADDRESSES)
    private String city;
    @Column(table = ADDRESSES)
    private String street;
    @Column(table = ADDRESSES)
    private Integer houseNumber;

    public Address() {
    }

    public Address(String country, String city, String street, Integer houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }
}
