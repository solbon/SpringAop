package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by solina on 03.05.2017.
 */
@Aspect
public class LoggingAspect {

    @Before("allGetters() && allCircleMethods()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }

    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second advice executed.");
    }

    @Pointcut("execution(* get*(..))")
    public void allGetters() {}

    @Pointcut("within(com.example.model.Circle)")
    public void allCircleMethods() {}

}
