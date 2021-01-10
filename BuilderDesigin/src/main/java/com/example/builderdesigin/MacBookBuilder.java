package com.example.builderdesigin;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class MacBookBuilder extends Builder {

    private Computer computer = new MacBook();

    @Override
    void buildBoard(String board) {
        computer.setBoard(board);

    }

    @Override
    void buildDisplay(String display) {

        computer.setDisplay(display);
    }

    @Override
    void buildOs() {
        computer.setOs();

    }

    @Override
    Computer build() {
        return computer;
    }
}
