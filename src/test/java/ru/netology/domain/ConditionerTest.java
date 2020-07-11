package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromLowest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(17);
        conditioner.increaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseFromHighest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(27);
        conditioner.increaseCurrentTemperature();
        assertEquals(27, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseFromLowest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(17);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseFromHighest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(27);
        conditioner.decreaseCurrentTemperature();
        assertEquals(27, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseHigherThanHighest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(100);
        conditioner.decreaseCurrentTemperature();
        assertEquals(99, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseHigherThanHighest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(100);
        conditioner.increaseCurrentTemperature();
        assertEquals(101, conditioner.getCurrentTemperature());
    }


    @Test
    public void increaseLowerThanLowest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(12);
        conditioner.increaseCurrentTemperature();
        assertEquals(13, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseLowerThanLowest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(12);
        conditioner.decreaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }





}