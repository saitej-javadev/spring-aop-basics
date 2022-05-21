package com.saitej.springaopbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringAopBasicsApplication {

    public static void main(String[] args) {
      ApplicationContext context=  SpringApplication.run(SpringAopBasicsApplication.class, args);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout("Approved");
        shoppingCart.quantity();
    }

}
