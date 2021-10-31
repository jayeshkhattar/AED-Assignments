/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author abc
 */
public class Patient extends Person {

    private String patientNumber;
    private LocalDate joiningDate;

    public Patient() {
        
    }

    public Patient(String patientNumber, String name, LocalDate dob, long phone, String email, long ssn, String healthPlanNumber, LocalDate joiningDate, House house) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.ssn = ssn;
        this.healthPlanNumber = healthPlanNumber;
        this.name = name;
        this.patientNumber = patientNumber;
        this.joiningDate = joiningDate;
        this.house = house;
    }
    
    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return patientNumber;
    }
    
}