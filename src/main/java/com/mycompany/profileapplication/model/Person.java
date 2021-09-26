/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.profileapplication.model;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author abc
 */
public class Person {
    private String name;
    private String address;
    private String zip;
    private String country;
    private Date dob;
    private String phone;
    private String faxNumber;
    private String email;
    private String ssn;
    private String medicalRecNumber;
    private String healthPlanNumber;
    private String licenseNumber;
    private String vin;
    private String licensePlate;
    private String linkedin;
    private String ipAddress;
    private String filePath;
    
    private String digitRegex = "[0-9]+";
    private static final Pattern emailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    //The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999.
    //Digits four and five are called the group number and range from 01 to 99.
    //The last four digits are serial numbers from 0001 to 9999.
    private String ssnRegex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
    private String alphaNumericRegex = "^[a-zA-Z0-9]+$";
    //\d represents digits in regular expressions, same as [0-9]
    //\\d{1, 2} catches any one or two-digit number
    //(0|1)\\d{2} catches any three-digit number starting with 0 or 1.
    //2[0-4]\\d catches numbers between 200 and 249.
    //25[0-5] catches numbers between 250 and 255.
    private String IpAddressRegex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
    

    private Pattern pattern = Pattern.compile(alphaNumericRegex);


    public String getName() {
        return name;
    }

    public String setName(String name) {
        if("".equals(name))
            return "Name is empty. Please fill name to submit.";
        else if(name.length()>255)
            return "Keep length of Name less than 255 characters.";            
        else 
            this.name = name;
        return "";
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        if("".equals(address))
            return "Address is empty. Please fill address to submit.";
        else
            this.address = address;
        return "";
    }

    public String getZip() {
        return zip;
    }

    public String setZip(String zip) {
        if("".equals(zip))
            return "Zip Code is empty. Please fill Zip Code to submit.";
        else if(isNumeric(zip) == false)
            return "Incorrect Zip Code. Please enter valid Zip Code.";
        else if(zip.length()<5 || zip.length()>6)
            return "Incorrect Zip Code. Please enter valid Zip Code";
        else
            this.zip = zip;
        return "";
    }

    public String getCountry() {
        return country;
    }

    public String setCountry(String country) {
        if("".equals(country) || "Select Country".equals(country))
            return "Please select Country to submit.";
        else
            this.country = country;
        return "";
    }
    public Date getDob() {
        return dob;
    }

    public String setDob(Date dob) {
        Date today = Calendar.getInstance().getTime();
        if(dob == null)
            return "Date of Birth is empty or has invalid value. Please fill valid Date of Birth.";
        else if(dob.after(today))
            return "Date of Birth cannot be in future.";
        else
            this.dob = dob;
        return "";
    }
    public String getPhone() {
        return phone;
    }

    public String setPhone(String phone) {
        if("".equals(phone))
            return "Phone is empty. Please fill phone to submit.";
        else if(phone.length() != 10 || phone.matches(digitRegex) == false)
            return "Phone number is invalid. Please enter valid 10 digit Phone number.";
        else
            this.phone = phone;
        return "";
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String setFaxNumber(String faxNumber) {
        if("".equals(faxNumber) == false && (faxNumber.length() != 10 || faxNumber.matches(digitRegex) == false))
            return "Incorrect Fax Number. Please enter a valid 10 digit Fax number.";
        else
            this.faxNumber = faxNumber;
        return "";
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        if("".equals(email))
            return "Email Address is empty. Please fill email address to submit.";
        if(validateEmail(email) == false)
            return "Incorrect Email Address. Please enter a valid email address.";
        else
            this.email = email;
        return "";
    }
    public String getFilePath() {
        return filePath;
    }

    public String setFilePath(String filePath) {
        if("".equals(filePath) || filePath == null)
            return "Please upload your photo to submit.";
        else
            this.filePath = filePath;
        return "";
    }

    public String getSsn() {
        return ssn;
    }

    public String setSsn(String ssn) {
        Pattern patternSsn = Pattern.compile(ssnRegex);
        if("".equals(ssn) == false && patternSsn.matcher(ssn).matches() == false)
            return "Incorrect Social Security Number. Please enter a valid Social Security Number.";
        else
            this.ssn = ssn;
        return "";
    }

    public String getHealthPlanNumber() {
        return healthPlanNumber;
    }

    public String setHealthPlanNumber(String healthPlanNumber) {
        if("".equals(healthPlanNumber) == false && pattern.matcher(healthPlanNumber).matches()== false)
            return "Health Plan beneficiary number is invalid. Please fill valid alphanumeric value.";
        else
            this.healthPlanNumber = healthPlanNumber;
        return "";
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String setLicenseNumber(String licenseNumber) {
        if("".equals(licenseNumber) == false && pattern.matcher(licenseNumber).matches()== false)
            return "Certificate/license number is invalid. Please fill valid alphanumeric value.";
        else
            this.licenseNumber = licenseNumber;
        return "";
    }

    public String getVin() {
        return vin;
    }

    public String setVin(String vin) {
        if("".equals(vin) == false && (pattern.matcher(vin).matches() == false || vin.length() != 16))
            return "Vehicle Identification Number entered is invalid. Please fill valid 16 digit alphanumeric VIN.";
        else
            this.vin = vin;
        return "";
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String setLicensePlate(String licensePlate) {
        if("".equals(licensePlate) == false && (pattern.matcher(licensePlate).matches() == false && (licensePlate.length()<6 || licensePlate.length()>8)))
            return "Vehicle License Plate entered is invalid. Please fill a valid 6-8 digit alphanumeric Vehicle License Plate.";
        else
            this.licensePlate = licensePlate;
        return "";
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String setLinkedin(String linkedin) {
        if("".equals(linkedin) == false && (pattern.matcher(linkedin).matches() == false))
            return "Linkedin Id entered is invalid. Please fill a valid alphanumeric linkedin Id.";
        else
            this.linkedin = linkedin;
        return "";
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String  setIpAddress(String ipAddress) {
        Pattern ipPattern = Pattern.compile(IpAddressRegex);
        if("".equals(ipAddress) == false && ipPattern.matcher(ipAddress).matches() == false)
            return "IP Address is invalid. Please fill valid IP address in right format.";
        else
            this.ipAddress = ipAddress;
        return "";
    }
    public String getMedicalRecNumber() {
        return medicalRecNumber;
    }

    public String setMedicalRecNumber(String medicalRecNumber) {
        if("".equals(medicalRecNumber) == false && pattern.matcher(medicalRecNumber).matches() == false)
            return "Medical Record Number you entered is invalid. Please fill valid alphanumeric value.";
        else
            this.medicalRecNumber = medicalRecNumber;
        return "";
    }
    public boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean validateEmail(String emailStr) {
        Matcher matcher = emailAddressRegex.matcher(emailStr);
        return matcher.find();
    }
}
