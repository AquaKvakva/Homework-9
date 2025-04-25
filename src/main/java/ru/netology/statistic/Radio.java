package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation;
    private int maxVolume = 101;
    private int minVolume;

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
        this.maxVolume = stationsCount - 1;
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

