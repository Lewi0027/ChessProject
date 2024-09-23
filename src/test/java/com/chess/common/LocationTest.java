package com.chess.common;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LocationTest {

    @Test
    public void testLocationCreation() {
        Location location = new Location(File.A, 1);
        assertEquals(File.A, location.getColumn());
        assertEquals(1, location.getRow());
        System.out.println("testLocationCreation() was passed.");
    }

    @Test
    public void testToString() {
        Location location = new Location(File.B, 3);
        String expected = "Location: Column=B, Row=3";
        assertEquals(expected, location.toString());
        System.out.println("testLocationToString() was passed.");
    }
}
