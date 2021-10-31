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
public class EncounterHistory {
    
    private List<Encounter> encounterList;
    private Patient patient;

    public EncounterHistory(List<Encounter> encounterList, Patient patient) {
        this.encounterList = encounterList;
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(List<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public EncounterHistory() {
        encounterList = new ArrayList<Encounter>();
    }
}