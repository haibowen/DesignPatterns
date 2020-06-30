package com.example.observerdemo;

public class MyClass {
    public static void main(String[] args) {
        WeatherData mWeatherData=new WeatherData();
        CurrentConditionsDisplay mCurrentConditionsDisplay=new CurrentConditionsDisplay(mWeatherData);
        StatisticDisplay mStatisticDisplay=new StatisticDisplay(mWeatherData);

    mWeatherData.setMeasurements(40,50,60.f);

    }
}