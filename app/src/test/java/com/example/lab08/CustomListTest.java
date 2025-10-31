package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        // To test deletion of cities, we first create a city to delete
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        list.addCity(calgary);
        // Test if it got added correctly
        assertTrue(list.hasCity(calgary));

        // Now we delete

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        // now we commit, we haven't yet implemented deleteCity so the test should fail

    }

    public void testCountCities(){
        // We'll add two cities and test if the count is correct
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        City toronto = new City("Toronto", "Ontario");
        list.addCity(calgary);
        list.addCity(toronto);

        assertEquals(2, list.countCities());

        // Now we test, 0, 1 and greater than or equal to 2, but we already did 2
        list.deleteCity(calgary);
        assertEquals(1, list.countCities());

        // finally, empty case
        list.deleteCity(toronto);
        assertEquals(0, list.countCities());

    }

}



