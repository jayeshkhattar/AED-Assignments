/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abc
 */
public class CarList implements Comparator<Car> {
    
    private ArrayList<Car> carLst;
    private Map<Integer, Car> carMap;
    private String sort;
    
    public CarList() {
        this.carLst = new ArrayList<Car>();
        carMap = new HashMap<Integer, Car>();
    }

    public ArrayList<Car> getCarLst() {
        return carLst;
    }

    public Map<Integer, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<Integer, Car> carMap) {
        this.carMap = carMap;
    }
    
    public void setCarLst(ArrayList<Car> carLst) {
        this.carLst = carLst;
//        for(int i=0; i<carLst.size(); i++)
  //          carMap.put(Integer.valueOf(i), carLst.get(i));
    }
    public void addNewCar(Car car) {
        carLst.add(car);
    }
    public void deleteCar(Car car) {
        carLst.remove(car);
    }
    public String checkSerialNumber(String serialNumber) {
        String error = "";
        for(Car c : carLst) {
            if(c.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                error = "Duplicate Serial Number. Please fill a valid serial Number or check the list for duplicate data.";
                break;
            }
        }
        return error;
    }    
    public int compare(Car a, Car b)
    {
        if(sort == "Make")
            return a.getMake().compareTo(b.getMake());
        else if(sort == "Model")
            return a.getModel().compareTo(b.getModel());
        if(sort == "Year")
            return a.getYear() - b.getYear();
        if(sort == "City")
            return a.getCity().compareTo(b.getCity());
        return 0;
    }
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
