package com.example.lib;

import com.example.lib.interface_demo.DisplayElement;
import com.example.lib.interface_demo.ObserverOne;
import com.example.lib.interface_demo.Subject;

public class CurrentConditionsDisplay implements ObserverOne, DisplayElement {
    private  float temperature;
    private float humidity;
    private Subject  weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        //把最近的温度跟湿度显示出来
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();

    }
}
