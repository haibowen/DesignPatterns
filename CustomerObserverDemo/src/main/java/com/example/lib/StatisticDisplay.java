package com.example.lib;

import com.example.lib.interface_demo.DisplayElement;
import com.example.lib.interface_demo.ObserverOne;
import com.example.lib.interface_demo.Subject;

//其中一个观察者
public class StatisticDisplay implements ObserverOne, DisplayElement {

    private float temperature;
    private float humity;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" Statistic conditions:" + temperature + "F degrees and  " + humity + "% humidity");


    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humity = humidity;
        display();

    }
}
