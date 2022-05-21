package com.saitej.springaopbasics;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

   //* com.saitej.springaopbasics.ShoppingCart.checkout()) ===> any return type any package.anyclass.method()
   @Before("execution(* com.saitej.springaopbasics.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println("LoggingAspect.beforeLogger is called");
       System.out.println(jp.getSignature());
       System.out.println(jp.getArgs()[0].toString());
    }

    @After("execution(* com.saitej.springaopbasics.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("LoggingAspect.afterLogger is called");
    }


    @AfterReturning(value = "execution(* com.saitej.springaopbasics.ShoppingCart.quantity())",returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("LoggingAspect.afterReturning : " + retVal);
    }
}


