package org.example.building;

public class Premise
{

    private  double area;
    private  Building building;

    public Premise(double area, Building building) {
        this.area = area;
        this.building = building;
    }

    public double getArea() {
        return area;
    }

    public Building getBuilding() {
        return building;
    }

    public  void capacity(){
        System.out.println("premise:"+this.area);
    }

    @Override
    public String toString() {
        return "Premise{" +
                "area=" + area +
                ", building=" + building +
                '}';
    }
}
