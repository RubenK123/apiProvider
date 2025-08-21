package com.example.apiProvider.models;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String firstname;
    private String surname;
    private LocalDate dateOfBirth;
    private RabbitConnectionDetails.Address address; // note: keeping your spelling for consistency
    private List<PhoneNumber> phoneNumber;
    private String emailAddress;
    private String company;
    private LocalDate startOfEmployment;
    private LocalDate endOfEmploymet;

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public RabbitConnectionDetails.Address getAddress() {
        return address;
    }

    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCompany() {
        return company;
    }

    public LocalDate getStartOfEmployment() {
        return startOfEmployment;
    }

    public LocalDate getEndOfEmploymet() {
        return endOfEmploymet;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(RabbitConnectionDetails.Address address) {
        this.address = address;
    }

    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setStartOfEmployment(LocalDate startOfEmployment) {
        this.startOfEmployment = startOfEmployment;
    }

    public void setEndOfEmploymet(LocalDate endOfEmploymet) {
        this.endOfEmploymet = endOfEmploymet;
    }
}
