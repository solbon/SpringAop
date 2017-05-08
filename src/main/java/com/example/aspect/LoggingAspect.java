package com.example.aspect;

import com.example.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by solina on 03.05.2017.
 */
@Aspect
public class LoggingAspect {

//    @Before("allCircleMethods()")
//    public void loggingAdvice(JoinPoint joinPoint) {
//        System.out.println(((Circle) joinPoint.getTarget()));
//    }

//    @Before("allGetters()")
//    public void secondAdvice() {
//        System.out.println("Second advice executed.");
//    }

    @AfterReturning(pointcut = "args(name)", returning = "result")
    public void returningMethod(String name, String result) {
        System.out.println("argument is '" + name + "' and returning string is '" + result + "'");
    }

    @Before("args(name)")
    public void stringArgumentMethods(String name) {
        System.out.println("String argument passed. Value is '" + name + "'");
    }

    @Around("@annotation(com.example.aspect.Loggable)")
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

    @Pointcut("execution(* get*(..))")
    public void allGetters() {}

    @Pointcut("within(com.example.model.Circle)")
    public void allCircleMethods() {}

}
