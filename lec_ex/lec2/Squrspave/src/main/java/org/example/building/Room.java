package org.example.building;

public class Room extends Premise{
    private  int numberOfBeds;

    public Room(double area, Building building, int numberOfBeds) {
        super(area, building);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    @Override
    public void capacity() {
        System.out.println("room capacity: " +this.numberOfBeds + " " +this.getArea());
        //super.capacity();
    }


    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                "} " + super.toString();
    }
}
