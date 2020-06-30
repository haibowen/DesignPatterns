package com.example.lib;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData mWeatherData=new WeatherData();//建立一个weatherData 对象

        CurrentConditionsDisplay mCurrentConditionsDisplay=new CurrentConditionsDisplay(mWeatherData);//当前观察者
        StatisticDisplay mStatisticDisplay=new StatisticDisplay(mWeatherData);//未来观察者
        mWeatherData.setMeasurements(80,65,30.4f);
        mWeatherData.setMeasurements(81,66,31.4F);

    }
}