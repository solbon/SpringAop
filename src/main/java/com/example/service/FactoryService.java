package com.example.service;

import com.example.model.Circle;
import com.example.model.Triangle;

/**
 * Created by Solbon on 2017-05-10.
 */
public class FactoryService {

    public Object getBean(String beanType) {
        if ("shapeService".equals(beanType))
            return new ShapeServiceProxy();
        if ("circle".equals(beanType))
            return new Circle();
        if ("triangle".equals(beanType))
            return new Triangle();
        return null;
    }
}
