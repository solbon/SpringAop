package com.example.model;

/**
 * Created by solina on 03.05.2017.
 */
public class Circle {

    int count = 10;

    private String name;

    public String getName() {
        return name;
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
