package com.example.builderdesigin;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public  abstract class Computer {

    protected String Board;
    protected  String Display;
    protected  String Os;

    protected Computer(){

    }
    public void setBoard(String board){
        Board=board;

    }
    public void setDisplay(String display){
        Display=display;
    }

    /**
     * 未实现的方法
     */
    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "Board='" + Board + '\'' +
                ", Display='" + Display + '\'' +
                ", Os='" + Os + '\'' +
                '}';
    }
}
