package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    int numFloors = 0;

    public List<Floor> floorList = new ArrayList<Floor>();

    public Garage(){
        }


    /**
     * Returns true if garage is full.
     */
    public boolean isFull() {
        for (int i = 0; i < floorList.size(); i++) {
            if (!floorList.get(i).isFull()) {
                return false;
            }
        } return true;
    }

    public void addFloor(Floor floorName) {
        
        boolean uniqueFloor = true;
        for (int i = 0; i < numFloors; i++) {
            if (floorList.get(i).name == floorName.name) {
                uniqueFloor = false;
            }
        }

        if (uniqueFloor) {
            floorList.add(floorName);
            numFloors++;
        } else {
            throw new IllegalStateException();
        }
    }


}
