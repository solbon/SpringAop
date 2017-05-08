package com.example;

import com.example.model.Circle;
import com.example.model.Foo;
import com.example.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by solina on 03.05.2017.
 */
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        Circle circle = shapeService.getCircle();
        circle.setNameAndReturn("Dummy name");
    }
}
