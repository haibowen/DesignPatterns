package com.example.lib.interface_demo;


public interface Subject {

      void registerObserver(ObserverOne o);
      void  removeObserver(ObserverOne o);
      void  notifyObservers();
}
