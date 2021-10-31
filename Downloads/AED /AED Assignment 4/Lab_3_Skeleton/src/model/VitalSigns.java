/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author archil
 */
public class VitalSigns {

    private int bodyTemperature;
    private int respirationRate;
    private int bloodPressureHigh;
    private int bloodPressureLow;

    public VitalSigns(int bodyTemperature, int respirationRate, int bloodPressureHigh, int bloodPressureLow) {
        this.bodyTemperature = bodyTemperature;
        this.respirationRate = respirationRate;
        this.bloodPressureHigh = bloodPressureHigh;
        this.bloodPressureLow = bloodPressureLow;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getBloodPressureHigh() {
        return bloodPressureHigh;
    }

    public void setBloodPressureHigh(int bloodPressureHigh) {
        this.bloodPressureHigh = bloodPressureHigh;
    }

    public int getBloodPressureLow() {
        return bloodPressureLow;
    }

    public void setBloodPressureLow(int bloodPressureLow) {
        this.bloodPressureLow = bloodPressureLow;
    }
    
}
