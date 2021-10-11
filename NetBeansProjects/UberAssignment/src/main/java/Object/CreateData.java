/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abc
 */
public class CreateData {
    
//    public List<Car> carList;
    
    public ArrayList<Car> createCarData() {
        ArrayList<Car> carList = new ArrayList<Car>();
        List<String> cityList = new ArrayList<String>();
        cityList.add("Boston");
        cityList.add("Los Angeles");
        cityList.add("New York");
        cityList.add("Charlotte");
        cityList.add("Chicago");
        
        List<String> modelList = new ArrayList<String>();
        modelList.add("Civic");
        modelList.add("Verna");
        modelList.add("Camry");
        modelList.add("Compass");
        modelList.add("Fusion");
        modelList.add("Accord");
        modelList.add("Elantra");
        modelList.add("Corolla");
        modelList.add("Wrangler");
        modelList.add("Bronco");
        modelList.add("Odyssey");
        modelList.add("Sonata");
        modelList.add("Camry");
        modelList.add("Prius");
        modelList.add("Escape");

        int j = 0;
        for(int i=0;i<15;i=i+5) {
            carList.add(new Car("Honda Owner " + j, "Honda", modelList.get(i%15), 2014+i-3, (i%2 == 0), 4 + j, "HONDA"+27+i, i%2 == 0, cityList.get(j)));
            carList.add(new Car("Hyundai Owner " + j,"Hyundai", modelList.get((i+1)%15), 2014+i-3, (i%2 == 0), 4 + j, "HYUNDAI"+37+i, i%2 == 0, cityList.get(j)));
            carList.add(new Car("Toyota Owner " + j,"Toyota", modelList.get((i+2)%15), 2014+i-3, (i%2 == 0), 4 + j, "TOYOTA"+47+i, i%2 == 0, cityList.get(j)));
            carList.add(new Car("Jeep Owner " + j,"Jeep", modelList.get((i+3)%15), 2014+i-3, (i%2 == 0), 4 + j, "JEEP"+57+i, i%2 == 0, cityList.get(j)));
            carList.add(new Car("Ford Owner " + j,"Ford", modelList.get((i+4)%15), 2014+i-3, (i%2 == 0), 4 + j, "FORD"+67+i, i%2 == 0, cityList.get(j)));
            j++;
        }
        return carList;
    }
    
}
