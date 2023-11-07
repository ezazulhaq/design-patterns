package com.design.observer.builtin.impl;

import java.util.Observable;
import java.util.Observer;

import com.design.observer.builtin.inter.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
