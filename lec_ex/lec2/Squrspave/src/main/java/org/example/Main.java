package org.example;

import org.example.building.Building;
import org.example.building.Premise;
import org.example.building.Room;

public class Main {
    public static void main(String[] args) {

        Building building = new Building(200);
        Premise premise = new Premise(60,building);
        Room room = new Room(30 , building , 2);
        System.out.println(building);
        System.out.println(premise);

        building.capacity();
        premise.capacity();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        room.capacity();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        Premise premiseRef;

        premiseRef = premise;
        premiseRef.capacity();
        premiseRef = room;
        premiseRef.capacity();
    }
}