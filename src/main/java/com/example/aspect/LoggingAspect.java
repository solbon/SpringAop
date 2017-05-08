package com.example.aspect;

import com.example.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by solina on 03.05.2017.
 */
@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println(((Circle) joinPoint.getTarget()));
    }

    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second advice executed.");
    }

    @Before("args(name)")
    public void stringArgumentMethods(String name) {
        System.out.println("String argument passed. Value is '" + name + "'");
    }

    @Pointcut("execution(* get*(..))")
    public void allGetters() {}

    @Pointcut("within(com.example.model.Circle)")
    public void allCircleMethods() {}

}
