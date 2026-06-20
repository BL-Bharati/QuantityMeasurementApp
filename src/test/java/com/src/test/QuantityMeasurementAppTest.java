package com.src.test;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementAppTest {


    @Test
    public void testEquality_SameValue() {
        Main.Feet feet1 =
                new Main.Feet(1.0);

        Main.Feet feet2 =
                new Main.Feet(1.0);

        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testEquality_DifferentValue() {
        Main.Feet feet1 =
                new Main.Feet(1.0);

        Main.Feet feet2 =
                new Main.Feet(2.0);

        assertFalse(feet1.equals(feet2));
    }

    @Test
    public void testEquality_NullComparison() {
        Main.Feet feet =
                new Main.Feet(1.0);

        assertFalse(feet.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {
        Main.Feet feet =
                new Main.Feet(1.0);

        String value = "ABC";

        assertFalse(feet.equals(value));
    }

    @Test
    public void testEquality_SameReference() {
        Main.Feet feet =
                new Main.Feet(1.0);

        assertTrue(feet.equals(feet));
    }
}