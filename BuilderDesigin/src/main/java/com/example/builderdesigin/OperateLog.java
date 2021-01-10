package com.example.builderdesigin;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class OperateLog {

    private int id;
    private String name;
    private String des;

    public int getId() {
        return id;
    }

    public OperateLog setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OperateLog setName(String name) {
        this.name = name;
        return this;
    }

    public String getDes() {
        return des;
    }

    public OperateLog setDes(String des) {
        this.des = des;
        return this;
    }
}
