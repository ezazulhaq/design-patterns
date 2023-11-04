package com.design.observer.impl;

import com.design.observer.inter.DisplayElement;
import com.design.observer.inter.Observer;
import com.design.observer.inter.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    @SuppressWarnings("unused")
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Dispay : "
                + temperature + " F degree and "
                + humidity + " % humidity");
    }

}
