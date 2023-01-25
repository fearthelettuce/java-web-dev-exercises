package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.After;
import org.junit.Before;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car test_car;
    @Before
    public void createTestData(){
        test_car = new Car("Chevrolet", "Silverado 1500", 25, 18);
    }
    @Test
    public void testInitialGasTank(){
        assertEquals(test_car.getGasTankLevel(), 25, .001);
    }
    @Test
    public void redundantTest(){
        assertFalse(test_car.getGasTankLevel() == 0);
    }
//    @Before
//    public void driveCar(){
//
//    }
    @Test
    public void testTankWithinRange(){
        test_car.setGasTankLevel(25);
        test_car.drive(72);
        assertEquals(test_car.getGasTankLevel(), (21), .001);
    }
    @Test
    public void testTankOutsideRange(){
        test_car.setGasTankLevel(25);
        test_car.drive(18*30);
        assertTrue(test_car.getGasTankLevel() == 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxTankSize(){
        test_car.setGasTankLevel(25);
        test_car.addGas(5);
        fail("shouldn't get here, can't have more gas than tank size can hold... well, unless you put it in a gas can, but that feature hasn't been implemented yet.");
    }
    //TODO: can't have more gas than tank size, expect an exception

}
