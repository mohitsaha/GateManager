package model;

abstract public class Person {
    int id;

    Person(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Person) {
            Person resident = (Person) o;
            return id == resident.id;
        }
        return false;
    }

    @Override
    public String toString() {
        //System.out.println("Hello");
        return "Person with id " + id;
    }
}
