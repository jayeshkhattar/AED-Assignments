/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author abc
 */
public class Encounter {
    
    private Date encounterDate;
    private String visitType;
    private String department;
    private VitalSigns vitalSign;

    public Encounter(Date encounterDate, String visitType, String department, VitalSigns vitalSign) {
        this.encounterDate = encounterDate;
        this.visitType = visitType;
        this.department = department;
        this.vitalSign = vitalSign;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
    
    @Override
    public String toString() {
        return String.valueOf(encounterDate);
    }
}
