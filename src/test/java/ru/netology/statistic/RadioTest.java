package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldTestStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestNext() {
        Radio rad = new Radio();

        rad.next(8);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverNext() {
        Radio rad = new Radio();

        rad.next(9);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrev() {
        Radio rad = new Radio();

        rad.prev(8);

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverPrev() {
        Radio rad = new Radio();

        rad.prev(0);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNumberOfStation() {
        Radio rad = new Radio();

        rad.setNumberOfStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestOverNumberOfStation() {
        Radio rad = new Radio();

        rad.setNumberOfStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestUnderNumberOfStation() {
        Radio rad = new Radio();

        rad.setNumberOfStation(-1);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTheSoundLouder() {
        Radio rad = new Radio();

        rad.setToSoundLouder(99);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheOverSoundLouder() {
        Radio rad = new Radio();

        rad.setToSoundLouder(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheSoundQuiet() {
        Radio rad = new Radio();

        rad.setToSoundQuiet(99);

        int expected = 98;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTheOverSoundQuiet() {
        Radio rad = new Radio();

        rad.setToSoundQuiet(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
