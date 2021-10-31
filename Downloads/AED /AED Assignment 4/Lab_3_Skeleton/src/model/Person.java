package model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Person {
    String name;
    LocalDate dob;
    long phone;
    String email;
    long ssn;
    String healthPlanNumber;
    House house;

    private String digitRegex = "[0-9]+";
    private static final Pattern emailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private String ssnRegex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
    private String alphaNumericRegex = "^[a-zA-Z0-9]+$";

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

    public LocalDate getDob() {
        return dob;
    }

    public String setDob(Date dob) {
        if(dob == null)
            return "Date of Birth is empty or has invalid value. Please fill valid Date of Birth.";
//        else if(dob.after(today))
//            return "Date of Birth cannot be in future.";
        else {
            LocalDate today = new java.sql.Date(dob.getTime()).toLocalDate();
            this.dob = today;
        }
        return "";
    }
    public long getPhone() {
        return phone;
    }

    public String setPhone(long phone) {
        if("".equals(phone))
            return "Phone is empty. Please fill phone to submit.";
/*        else if(phone.length() != 10) //|| phone.matches(digitRegex) == false)
            return "Phone number is invalid. Please enter valid 10 digit Phone number.";
*/        else
            this.phone = phone;
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

    public long getSsn() {
        return ssn;
    }

    public String setSsn(long ssn) {
        Pattern patternSsn = Pattern.compile(ssnRegex);
        if("".equals(ssn) == false)
            return "Incorrect Social Security Number. Please enter a valid Social Security Number.";
        else
            this.ssn = ssn;
        return "";
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
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
