package com.example.lib.interface_demo;


public interface Subject { //主题需要实现的接口

      void registerObserver(ObserverOne o);
      void  removeObserver(ObserverOne o);
      void  notifyObservers();
}
