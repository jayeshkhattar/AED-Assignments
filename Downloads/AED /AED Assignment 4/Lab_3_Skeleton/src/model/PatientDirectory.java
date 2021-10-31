/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abc
 */
public class PatientDirectory {

    private List<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<Patient>();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    public void add(Patient pat) {
        patientList.add(pat);
    }
    public void addAll(List<Patient> ptd) {
        patientList.addAll(ptd);
    }
    
}
