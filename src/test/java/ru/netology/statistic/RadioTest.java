package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldTestStation() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestNext() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);

        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverNext() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrev() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);

        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverPrev() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNumberOfStation() {
        Radio rad = new Radio(10);

        rad.setNumberOfStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxNumberOfStation() {
        Radio rad = new Radio(10);

        rad.setNumberOfStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestCurrentStation() {
        Radio rad = new Radio(10);

        rad.setNumberOfStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMinNumberOfStation() {
        Radio rad = new Radio(10);

        rad.setNumberOfStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverNumberOfStation() {
        Radio rad = new Radio(10);
        rad.setNumberOfStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestUnderNumberOfStation() {
        Radio rad = new Radio(10);

        rad.setNumberOfStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestVolume() {
        Radio rad = new Radio(101);

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverVolume() {
        Radio rad = new Radio(101);

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTheSoundLouderInside() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(98);

        rad.setToSoundLouder();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheSoundLouder() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(99);

        rad.setToSoundLouder();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheOverSoundLouder() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(100);

        rad.setToSoundLouder();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTheSoundQuietInside() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(1);

        rad.setToSoundQuiet();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheSoundQuiet() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(0);

        rad.setToSoundQuiet();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheOverSoundQuiet() {
        Radio rad = new Radio(101);
        rad.setCurrentVolume(-1);

        rad.setToSoundQuiet();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 10;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 101;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }



}
