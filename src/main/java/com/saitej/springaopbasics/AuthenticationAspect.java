package com.saitej.springaopbasics;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

    @Pointcut("within(com.saitej.springaopbasics..*)")
    public void authenticationPointcut(){

    }
    @Pointcut("within(com.saitej.springaopbasics..*)")
    public void authorizationPointcut(){

    }

    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authenticate(){
        System.out.println("AuthenticationAspect.authenticate is called");
    }
}
