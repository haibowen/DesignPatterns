package com.example.builderdemo;

import java.util.Locale;

/**
 * Created on 1/10/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class Student {

    /** 非静态方法的
     * 链式调用的事例
     */

    public Student() {

    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 静态内部类
     */
    static class Builder {

        String name;
        String grade;
        int age;
        int number;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGrade() {
            return grade;
        }

        public Builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getNumber() {
            return number;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public void showMessage(){
            System.out.println("姓名"+this.name);
            System.out.println("年龄"+this.age);
            System.out.println("学号"+this.number);
        }
    }

}
