package com.company;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int totalParkingSpaces;
    int numAvailableSpaces;
    final String name;

    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Floor(String name, int totalParkingSpaces) {
        this.totalParkingSpaces = totalParkingSpaces;
        this.numAvailableSpaces = totalParkingSpaces; //vehicles can take up 1+ spaces
        this.name = name;

    }

    public boolean isFull() {
        if (numAvailableSpaces == 0) {
            return true;
        }
        return false;
    }

    public void addCar(Vehicle vehicleName) {
        if (!vehicleName.isParked) {
            if (vehicleName.size > numAvailableSpaces) {
                throw new IllegalStateException();
            }
            numAvailableSpaces -= vehicleName.size;
            vehicleName.isParked = true;
        }
    }

    public void removeCar(Vehicle vehicleName) {
        if (vehicleName.isParked) {
            numAvailableSpaces += vehicleName.size;
            vehicleName.isParked = false;
        }
    }

}
