package com.example.apitest;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainActivityTest {

    @Test
    public void testHabitEnFonctionTemperatureHauteTemperature() {
        Double temperatureActuel = 30.0;
        Habit habit = new Habit();

        habit.habitEnFonctionTemperature(temperatureActuel);

        assertNotEquals("pas besoin", habit.getChaussure());
        assertNotEquals("pas besoin", habit.getTshirt());
        assertNotEquals("pas besoin", habit.getShortCourt());
        assertEquals("pas besoin", habit.getPantalon());
        assertEquals("pas besoin", habit.getPull());
        assertEquals("pas besoin", habit.getVeste());
    }

    @Test
    public void testHabitEnFonctionTemperatureMoyenneTemperature() {
        Double temperatureActuel = 20.0;
        Habit habit = new Habit();

        habit.habitEnFonctionTemperature(temperatureActuel);

        assertNotEquals("pas besoin", habit.getChaussure());
        assertNotEquals("pas besoin", habit.getTshirt());
        assertEquals("pas besoin", habit.getShortCourt());
        assertNotEquals("pas besoin", habit.getPantalon());
        assertNotEquals("pas besoin", habit.getPull());
        assertEquals("pas besoin", habit.getVeste());
    }

    @Test
    public void testHabitEnFonctionTemperatureBasseTemperature() {
        Double temperatureActuel = 10.0;
        Habit habit = new Habit();

        habit.habitEnFonctionTemperature(temperatureActuel);

        assertNotEquals("pas besoin", habit.getChaussure());
        assertNotEquals("pas besoin", habit.getTshirt());
        assertEquals("pas besoin", habit.getShortCourt());
        assertNotEquals("pas besoin", habit.getPantalon());
        assertNotEquals("pas besoin", habit.getPull());
        assertNotEquals("pas besoin", habit.getVeste());
    }

}