import model.BuildingManager;
import model.Person;
import model.Resident;
import model.Visitor;

public class Main {
    public static void main(String[] args) {
        Resident re1 = new Resident(1);
        Person v1 = new Visitor(2);
        Person v2 = new Visitor(2);
        Person v3 = new Visitor(3);
        re1.approve(v1);
        re1.approve(v2);
        re1.reject(v3);

        BuildingManager bm1 = BuildingManager.getInstance();
        bm1.getAllInsideBuilding();
    }
}