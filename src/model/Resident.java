package model;

public class Resident extends Person {
    public Resident(int id) {
        super(id);
    }
    BuildingManager buildingManager = BuildingManager.getInstance();
    VisitorBook visitorBook = new VisitorBook();
    public void approve(Person re){
        System.out.println("visitor with id = "+ re.id + " approved");
        buildingManager.addInsideBuilding(re);
        //make a ResidentEntry object
        //add in visitorBook
        ResidentEntry residentEntry = new ResidentEntry(this,(Visitor) re,"Approved");
        visitorBook.book.add(residentEntry);
    }

    public void reject(Person re){
        System.out.println("visitor with id = "+ re.id + " declined");
        //make a ResidentEntry object
        //add in visitorBook
        ResidentEntry residentEntry = new ResidentEntry(this,(Visitor) re,"Declined");
        visitorBook.add(residentEntry);
    }
}
