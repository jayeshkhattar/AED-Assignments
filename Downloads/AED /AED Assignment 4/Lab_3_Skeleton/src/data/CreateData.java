/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.City;
import model.Community;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author abc
 */
public class CreateData {
    
    public List<City> createCity() {
        List<City> cityList = new ArrayList<City>();
        cityList.add(new City("Boston", "Massachusetts","USA"));
        cityList.add(new City("Manhattan", "New York", "USA"));
        return cityList;
    }

    public List<Community> createCommunity(List<City> cityList) {
        
        List<Community> communityList = new ArrayList<Community>();

        Community com = new Community("Mission Hill", cityList.get(0), 02120);
        communityList.add(com);
        com = new Community("Back Bay", cityList.get(0), 02111);
        communityList.add(com);
        com = new Community("Dorchester", cityList.get(0), 02101);
        communityList.add(com);
        communityList.add(new Community("Chelsea", cityList.get(1), 02150));
        communityList.add(new Community("Upper East Side", cityList.get(1), 10021));
        communityList.add(new Community("Tribeca", cityList.get(1), 10007));
        return communityList;
    }
    
    public List<House> createHouses(List<Community> commList) {
        List<House> hlist = new ArrayList<House>();
        hlist.add(new House(620, "Park Drive", commList.get(0)));
        hlist.add(new House(512, "Parker Hill", commList.get(0)));
        hlist.add(new House(10, "St Avenue", commList.get(0)));
        hlist.add(new House(9, "East Bay Street", commList.get(1)));
        hlist.add(new House(110, "Martin Avenue", commList.get(1)));
        hlist.add(new House(22, "Dorchester St", commList.get(2)));
        hlist.add(new House(56, "Bowen St", commList.get(2)));
        hlist.add(new House(452, "9th Ave", commList.get(3)));
        hlist.add(new House(63, "10th Ave", commList.get(3)));
        hlist.add(new House(682, "1st Ave", commList.get(4)));
        hlist.add(new House(684, "1st Ave", commList.get(4)));
        hlist.add(new House(15, "Franklin St", commList.get(5)));
        hlist.add(new House(84, "Chambers St", commList.get(5)));
        return hlist;
    }
    
    public List<Patient> createPatients(List<House> houseList) {
        
        List<Patient> patientList = new ArrayList<Patient>();

        int i=0;
        LocalDate date1 = LocalDate.of(1960, 5, 1);
        LocalDate date2 = LocalDate.of(1980, 3, 11);
        LocalDate date3 = LocalDate.of(1999, 9, 21);

        LocalDate date4 = LocalDate.of(2002, 2, 14);
        LocalDate date5 = LocalDate.of(2015, 10, 29);
        LocalDate date6 = LocalDate.of(2019, 12, 3);
                
        int asciiValue = 97;
        String name1 = "John";
        String name2 = "Mont";
        String name3 = "Horro";

        for(House hs : houseList) {
            String phString = "675"+(i)+"30"+(i+2)+"2"+(i);
            long ph = Long.valueOf(phString);
            String name = "";
            char convertedChar = (char)(asciiValue+i);
            patientList.add(new Patient("PAN00"+i, name1 + convertedChar, date1.plusDays(100+(i*i)), ph, name1+"@gmail.com", ph, "HAPN1"+i+"23"+(asciiValue-i), date4.plusDays(100+(i*i)), hs));
            String phString2 = "675"+(i)+"41"+(i+2)+"2"+(i);
            long ph2 = Long.valueOf(phString2);
            patientList.add(new Patient("PAN01"+i, name2 + convertedChar, date2.plusDays(100+(i*i)), ph2, name2+"@gmail.com", ph2, "HAPN2"+i+"43"+(asciiValue-i), date5.plusDays(100+(i*i)), hs));
            String phString3 = "675"+(i)+"52"+(i+2)+"2"+(i);
            long ph3 = Long.valueOf(phString3);
            patientList.add(new Patient("PAN02"+i, name3 + convertedChar, date3.plusDays(100+(i*i)), ph3, name3+"@gmail.com", ph3, "HAPN3"+i+"63"+(asciiValue-i), date6.plusDays(100+(i*i)), hs));
            i++;
        }
        return patientList;
    }
    public List<EncounterHistory> createEncounters(List<Patient> patientList) {
        
        List<EncounterHistory> ed = new ArrayList<EncounterHistory>();
        int i=0;
        
        List<LocalDate> dateLst = new ArrayList<LocalDate>();
        dateLst.add(LocalDate.of(2019, 3, 1));
        dateLst.add(LocalDate.of(2019, 5, 11));
        dateLst.add(LocalDate.of(2019, 9, 21));
        dateLst.add(LocalDate.of(2020, 2, 14));
        dateLst.add(LocalDate.of(2020, 10, 29));
        dateLst.add(LocalDate.of(2020, 12, 3));
        
        List<String> deptment = new ArrayList<String>();
        deptment.add("Outpatient department (OPD)");
        deptment.add("Inpatient Service (IP)");
        deptment.add("Medical");
        deptment.add("Nursing");
        deptment.add("Paramedical");
        deptment.add("Physical Medicine & Rehabilitation");
        deptment.add("Operation Theatre Complex (OT)");
        deptment.add("Pharmacy");
        deptment.add("Radiology");
        
        for(Patient pt : patientList) {
            List<Encounter> encounterList = new ArrayList<Encounter>();
            int low = 90-i;
            if(low<60)
                low = 80;
            int high = 115+i;
            if(low<60)
                low = 80;
            if(high > 180)
                high = 120;
            VitalSigns v1 = new VitalSigns(97+i, 12+i, high, low);
            
            encounterList.add(new Encounter(java.sql.Date.valueOf(dateLst.get(i%5)), "First Visit", deptment.get(i%8), v1));
            i++;
            low = 90-i;
            high = 115+i;
            if(low<60)
                low = 80;
            if(high > 180)
                high = 120;
            VitalSigns v2 = new VitalSigns(97+i, 12+i, high, low);
            encounterList.add(new Encounter(java.sql.Date.valueOf(dateLst.get(i%5)), "Follow Up", deptment.get(i%8), v2));
            i++;
            low = 90-i;
            high = 115+i;
            if(low<60)
                low = 80;
            if(high > 180)
                high = 120;
            VitalSigns v3 = new VitalSigns(97+i, 12+i, high, low);
            encounterList.add(new Encounter(java.sql.Date.valueOf(dateLst.get(i%5)), "First Visit", deptment.get(i%8), v3));
            i++;
            ed.add(new EncounterHistory(encounterList, pt));
        }
        return ed;
    }    
}
