/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author abc
 */
public class Car {
    
    private String ownerName;
    private String make;
    private String model;
    private int year;
    private boolean availabiltyStatus;
    private int seatCount;
    private String serialNumber;
    private String city;
    private boolean maintainCertValid;
    private LocalDateTime lastUpdatedTime;

    
    private String error = "";
    private String alphaNumericRegex = "^[a-zA-Z0-9]+$";
    private Pattern pattern = Pattern.compile(alphaNumericRegex);

    public Car() {
        
    }

    public Car(String ownerName, String make, String model, int year, boolean availabiltyStatus, int seatCount, String serialNumber, boolean maintainCertValid, String city) {
        this.ownerName = ownerName;
        this.make = make;
        this.model = model;
        this.year = year;
        this.availabiltyStatus = availabiltyStatus;
        this.seatCount = seatCount;
        this.serialNumber = serialNumber;
        this.maintainCertValid = maintainCertValid;
        this.city = city;
        //this.lastUpdatedTime = LocalDateTime.now();
    }

    
    public String getMake() {
        return make;
    }


    public String setMake(String make) {
        if(make.equalsIgnoreCase("Select")) {
            return "Please select Make of the car.";
        }
        this.make = make;
        return "";
    }

    public String getModel() {
        return model;
    }

    public String setModel(String model) {
        if("".equals(model)) {
            return "Please fill model of the car.";            
        }
        if(pattern.matcher(model).matches()== false)
            return "Model is invalid. Please fill valid car Model.";
        else
            this.model = model;
        return "";
    }

    public int getYear() {
        return year;
    }

    public String setYear(String year) {
        if(year.equalsIgnoreCase("Select")) {
            return "Please select Year of the car.";
        }
        this.year = Integer.parseInt(year.toString());
        return "";
    }

    public boolean getAvailabiltyStatus() {
        return availabiltyStatus;
    }

    public String getAvailabiltyStatusStr() {
        if(availabiltyStatus == true) 
            return "Yes";
        else 
            return "No";
    }

    public String setAvailabiltyStatus(boolean availabiltyStatus) {
        this.availabiltyStatus = availabiltyStatus;
        return error;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String setSeatCount(String seatCount) {
        if(seatCount.equalsIgnoreCase("Select")) {
            return "Please select Seat count in the car.";
        }
        this.seatCount = Integer.parseInt(seatCount.toString());
        return "";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String setSerialNumber(String serialNumber) {
        if("".equals(serialNumber)) {
            return "Please fill Serial number of the car.";            
        }
        if(pattern.matcher(serialNumber).matches()== false)
            return "Serial number is invalid. Please fill valid alphanumeric Serial Number.";
        else
            this.serialNumber = serialNumber;
        return "";
    }

    public boolean isMaintainCertValid() {
        return maintainCertValid;
    }
    
    public String isMaintainCertValidStr() {
        if(maintainCertValid == true) 
            return "Yes";
        else 
            return "No";
    }

    public String setMaintainCertValid(boolean maintainCertValid) {
        this.maintainCertValid = maintainCertValid;
        return error;
    }
    public String getCity() {
        return city;
    }

    public String setCity(String city) {
        if(city.equalsIgnoreCase("Select")) {
            return "Please select City of the car.";
        }
        this.city = city;
        return "";
    }
    public String getOwnerName() {
        return ownerName;
    }

    public String setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        if("".equals(ownerName))
            return "Name is empty. Please fill name to submit.";
        else if(ownerName.length()>255)
            return "Keep length of Name less than 255 characters.";            
        else 
            this.ownerName = ownerName;
        return "";
    }

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
    @Override
    public String toString() {
        return ownerName;
    }
}
