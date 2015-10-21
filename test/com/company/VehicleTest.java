package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class VehicleTest {
    @Test
    public void createCarisCorrect() {
        Vehicle honda = new Vehicle("Honda", "Red", 1);

        assertThat(honda.size, equalTo(1));
    }
}
