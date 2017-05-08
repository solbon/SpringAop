package com.example.model;

import com.example.aspect.Loggable;

/**
 * Created by solina on 03.05.2017.
 */
public class Circle {

    private String name;

    @Loggable
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
