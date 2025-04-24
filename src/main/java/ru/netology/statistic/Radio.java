package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


    public Radio() {
        this.maxStation = 10;
        this.maxVolume = 101;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
        this.maxVolume = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
        setCurrentStation(currentStation);
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
        setCurrentStation(currentStation);
    }

    public void setNumberOfStation(int currentStation) {
        setCurrentStation(currentStation);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToSoundLouder() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void setToSoundQuiet() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }
}

