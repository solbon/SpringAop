package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by solina on 03.05.2017.
 */
public class LoggingAspect {

    public Object myAroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        System.out.println("Before advice");
        try {
            result = joinPoint.proceed();
            System.out.println("After returning");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("After advice");
        return result;
    }

    public void allGetters() {}

}
