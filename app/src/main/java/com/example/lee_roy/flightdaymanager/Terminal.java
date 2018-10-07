package com.example.lee_roy.flightdaymanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terminal {

    Random rand = new Random();
    List<Gate> gates;
    List<PointOfInterest> poiList;

    public void addGate(Gate... gates) {
        for (Gate gate : gates) {
            this.gates.add(gate);
        }
    }

    public void addGate(List<Gate> gates) {
        this.gates = gates;
    }

    public void addPOIs(PointOfInterest... pois) {
        for (PointOfInterest poi : pois) {
            this.poiList.add(poi);
        }
    }

    public void addPOIS(List<PointOfInterest> pois) {
        this.poiList = pois;
    }

    public void generateRandomGates() {
        List<Gate> gates = new ArrayList<>();
        EnumClasses letters = new EnumClasses();
        int numGates = rand.nextInt(10);
        for (int i = 0; i < numGates; i++) {
            gates.add(new Gate(letters.getLetterAtIndex(i)));
        }
    }

}
