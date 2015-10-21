package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    int totalSpaces;
    int remainingSpaces;
    int numFloors;

    public List<Floor> floorList = new ArrayList<Floor>();

    public Garage(int spaces, int floors){ //TODO possibly rewrite this
        this.totalSpaces = spaces;
        this.numFloors = floors;

        for (int i=0; i < floors; i++) {
            addFloor(spaces/floors);
        }
    }

    /**
     * Returns true if garage is full.
     */
    public boolean isFull() {
        for (int i = 0; i < floorList.size(); i++) { //possibly rethink this
            if (!floorList.get(i).isFull()) {
                return false;
            }
        } return true;
    }

    private void addFloor(int spaces) {
        Floor floor = new Floor(spaces);
        floorList.add(floor);
    }


}
