package com.example.lib;

import com.example.lib.interface_demo.ObserverOne;
import com.example.lib.interface_demo.Subject;

import java.util.ArrayList;

//主题  或者说是被观察者
public class WeatherData implements Subject {
    private ArrayList observers; //存储所有观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(ObserverOne o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(ObserverOne o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverOne mObserverOne = (ObserverOne) observers.get(i);
            mObserverOne.update(temperature, humidity, pressure); //把状态告诉给每一个观察者

        }

    }

    public  void measurementsChanged(){
        notifyObservers();

    }
    //从气象站得到更新的值
    public  void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();

    }
}
