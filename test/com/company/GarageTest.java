package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GarageTest {
    @Test
    public void createGarage() {
        Garage marketGarage = new Garage(12, 4);

        assertThat(marketGarage.numFloors, equalTo(4));
        assertThat(marketGarage.floorList.size(), equalTo(4));
    }

    @Test
    public void isGarageFull() {
        Garage marketGarage = new Garage(2, 2);

        for (int i = 0; i < marketGarage.numFloors; i++) {
            Floor floor = marketGarage.floorList.get(i);
            Vehicle honda = new Vehicle("honda", "blue", i);
        }

        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(1);
        Vehicle honda = new Vehicle("honda", "blue", 1);
        Vehicle prius = new Vehicle("toyota", "green", 1);

        marketGarage.floorList.add(floor1);
        marketGarage.floorList.add(floor2);
    }
}
