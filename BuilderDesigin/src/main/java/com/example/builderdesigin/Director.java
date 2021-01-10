package com.example.builderdesigin;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class Director {

    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }
}
