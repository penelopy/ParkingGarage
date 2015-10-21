package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FloorTest {
    @Test(expected = IllegalStateException.class)
    public void addingCarToFullFloorThrowsException() {
        Floor floor2 = new Floor(3);
        Vehicle honda = new Vehicle("honda", "blue", 1);
        Vehicle prius = new Vehicle("toyota", "green", 1);
        Vehicle miniVan = new Vehicle("ford", "red", 2);

        floor2.addCar(honda);
        floor2.addCar(prius);
        floor2.addCar(miniVan);
    }

    @Test
    public void removingCarFromFloorCorrect() {
        Floor floor2 = new Floor(3);
        Vehicle honda = new Vehicle("honda", "blue", 1);
        Vehicle prius = new Vehicle("toyota", "green", 1);

        floor2.addCar(honda);
        floor2.addCar(prius);

        floor2.removeCar(honda);
        assertThat(floor2.numAvailableSpaces, equalTo(2));
    }

    @Test
    public void addCarToFloorReturnsCorrectValue() {
        Floor floor2 = new Floor(3);
        Vehicle honda = new Vehicle("honda", "blue", 1);
        Vehicle prius = new Vehicle("toyota", "green", 1);

        floor2.addCar(honda);
        floor2.addCar(prius);

        assertThat(floor2.numAvailableSpaces, equalTo(1));
    }
}
