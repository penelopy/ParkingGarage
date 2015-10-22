package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Floor> floorList = new ArrayList<Floor>();

    public Garage(){
        }

    /**
     * Returns true if garage is full.
     */
    public boolean isFull() {
        for (Floor floor:floorList) {
            if (!floor.isFull()) {
                return false;
            }
        } return true;
    }

    public void addFloor(Floor afloor) {
        if (isFloorNameUsed(afloor)) {
            throw new IllegalStateException();
        }
        else  {
            floorList.add(afloor);
        }
    }

    public int numFloorsinGarage(){
        return floorList.size();
    }

    public boolean isFloorNameUsed(Floor newFloor) {
        for (Floor floor:floorList) {
            if (newFloor.name == floor.name) {
                return true;
            }
        }
        return false;
    }


}
