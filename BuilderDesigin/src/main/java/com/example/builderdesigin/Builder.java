package com.example.builderdesigin;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public abstract class Builder {

    abstract void buildBoard(String board);

    abstract void buildDisplay(String display);

    abstract void buildOs();

    abstract Computer build();

}
