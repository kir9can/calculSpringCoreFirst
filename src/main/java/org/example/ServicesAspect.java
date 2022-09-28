package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class ServicesAspect {
    Logger logger=Logger.getLogger(this.getClass().getName());

    @Pointcut("execution(public * CalcService.*(..))")
    public void calcServicePointcut(){}

    @Before("calcServicePointcut()")
    public void loggMethod(JoinPoint joinPoint) {
        logger.log(Level.INFO, joinPoint.toString());
    }

}
