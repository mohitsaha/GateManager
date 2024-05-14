package model;

public class ResidentEntry {
    private int id;
    Person Resident;
    Person Visitor;
    String Permission;

    public ResidentEntry(model.Resident resident, model.Visitor visitor, String approved) {
        this.Resident = resident;
        this.Visitor = visitor;
        this.Permission = approved;
    }
}
