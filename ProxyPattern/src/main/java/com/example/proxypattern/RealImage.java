package com.example.proxypattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        loadFromDisk(fileName);

    }


    @Override
    public void display() {
        System.out.println("这是真实的Image接口的实现类");

    }

    private void loadFromDisk(String name) {
        System.out.println("这是从本地加载的名为" + name + "的图片");

    }
}
