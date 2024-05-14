package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuildingManager {
    HashMap<Person,ArrayList<Person>> BuildingMap = new HashMap<>();
    private static BuildingManager single_instance = null;

    public static synchronized BuildingManager getInstance()
    {
        if (single_instance == null)
            single_instance = new BuildingManager();

        return single_instance;
    }

    public void addInsideBuilding(Person person) {
        BuildingMap.putIfAbsent(person, new ArrayList<>());
        BuildingMap.get(person).add(person);
    }

    public void  getAllInsideBuilding() {
        for(Map.Entry<Person,ArrayList<Person>> entry : BuildingMap.entrySet()){
            Resident Resident = (Resident)entry.getKey();
            ArrayList<Person> visitors = entry.getValue();
            // Print model.Resident
            System.out.print(Resident);
//            for(Person visitorPerson : visitor){
//                // Print visitor
//                System.out.print(visitorPerson);
//            }
        }
    }
}
