import java.util.ArrayList;
import java.util.HashMap;

public class BuildingManager {
    HashMap<Person,ArrayList<Person>> BuildingMap = new HashMap<>();
    public void addInsideBuilding(Person person) {
        BuildingMap.putIfAbsent(person, new ArrayList<>());
        BuildingMap.get(person).add(person);
    }
}
