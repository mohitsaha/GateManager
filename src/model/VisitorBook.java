package model;

import java.util.ArrayList;

public class VisitorBook {
  //ArrayList of ResidentEntryClass
    ArrayList<ResidentEntry> book = new ArrayList<>();

    public void add(ResidentEntry residentEntry) {
        book.add(residentEntry);
    }
}
