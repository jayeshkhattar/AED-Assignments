/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author abc
 */
public class House {
    
    private int houseNum;
    private String StreetName;
    private Community community;
    private List<Person> residents;

    public House(int houseNum, String StreetName, Community community) {
        this.houseNum = houseNum;
        this.StreetName = StreetName;
        this.community = community;
    }
    
    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }
    
    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }    
    
    public void addPerson(Person p) {
        residents.add(p);
    }
    
    public String toString() {
        return this.houseNum+", "+this.StreetName;
    }
}
