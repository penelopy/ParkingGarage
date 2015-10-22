package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GarageTest {
    @Test
    public void createGarage() {
        Garage marketGarage = new Garage();
        Floor floor3 = new Floor("Floor 3", 4);
        marketGarage.addFloor(floor3);

        assertThat(marketGarage.numFloorsinGarage(), equalTo(1));
    }

    @Test
    public void isGarageFull() {
        Garage marketGarage = new Garage();

        Floor floor1 = new Floor("Floor 1", 1);
        Floor floor2 = new Floor("Floor 2", 1);
        Vehicle honda = new Vehicle("honda", "blue", 1);
        Vehicle prius = new Vehicle("toyota", "green", 1);
        floor1.addCar(honda);
        floor2.addCar(prius);

        marketGarage.addFloor(floor1);
        marketGarage.addFloor(floor2);
        assertTrue(marketGarage.isFull());

    }

    @Test(expected = IllegalStateException.class)
    public void addSameFloorObjectThrowsException() {
        Garage marketGarage = new Garage();
        Floor floor1 = new Floor("Floor 1", 1);
        marketGarage.addFloor(floor1);
        marketGarage.addFloor(floor1);
    }

//    @Test(expected = IllegalStateException.class)



}
