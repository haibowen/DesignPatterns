package com.example.observerdemo;

import java.util.Observable;
//被观察者 实现的是jdk内置的Observable类
public class WeatherData extends Observable {

    private  float temperature;
    private float humidity;
    private float pressure;
    public  WeatherData(){}


    public  void  measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public  void  setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
    public  float getTemperature(){
        return  temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
