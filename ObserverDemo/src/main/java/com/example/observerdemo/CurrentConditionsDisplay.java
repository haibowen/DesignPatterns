package com.example.observerdemo;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private  float humidity;
    Observable mObservable;

    public CurrentConditionsDisplay(Observable observable) {
        mObservable = observable;
        mObservable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");

    }

    @Override
    public void update(Observable obs, Object arg) {

        if (obs instanceof WeatherData){
            WeatherData mWeatherData= (WeatherData) obs;
            this.temperature=mWeatherData.getTemperature();
            this.humidity=mWeatherData.getHumidity();
            display();
        }

    }
}
