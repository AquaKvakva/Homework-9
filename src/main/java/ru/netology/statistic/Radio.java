package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next(int currentStation) {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void prev(int currentStation) {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void setNumberOfStation(int currentStation) {
        setCurrentStation(currentStation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToSoundLouder(int currentVolume) {
        if (currentVolume <= 100) {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);

        }
        if (currentVolume > 100) {
            setCurrentVolume(currentVolume);
        }
    }

    public void setToSoundQuiet(int currentVolume) {
        if (currentVolume >= 0) {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);
        }
        if (currentVolume < 0) {
            setCurrentVolume(currentVolume);
        }
    }
}

