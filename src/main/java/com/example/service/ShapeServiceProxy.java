package com.example.service;

import com.example.aspect.LoggingAspect;
import com.example.model.Circle;

/**
 * Created by Solbon on 2017-05-10.
 */
public class ShapeServiceProxy extends ShapeService {

    public Circle getCircle() {
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }
}
