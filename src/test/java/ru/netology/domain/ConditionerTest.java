package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseFromLowest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(27);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(17);
        conditioner.increaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }



}