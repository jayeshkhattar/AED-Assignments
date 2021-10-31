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
public class Community {
    
    private String communityName;
    private City city;
    private long zipCode;

    public Community(String communityName, City city, long zipCode) {
        this.communityName = communityName;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }
    
    public String toString() {        
        return communityName + ", " + zipCode;
    }
    
}
