package com.company;

public class Floor {
    int totalParkingSpaces;
    int numAvailableSpaces;

    public Floor(int totalParkingSpaces) {
        this.totalParkingSpaces = totalParkingSpaces;
        this.numAvailableSpaces = totalParkingSpaces;
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
