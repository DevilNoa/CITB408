package org.example.building;

public class Building {
    public double area;

    public Building(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void capacity(){
        System.out.println("building:"+this.area);

    }

    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                '}';
    }
}
