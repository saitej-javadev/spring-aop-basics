package com.saitej.springaopbasics;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {


    public void checkout(String status){
        //Logging
        //Authentication and Authorization
        //Sanitize the data
        System.out.println("ShoppingCart.checkout is called");
    }

    public int quantity(){
        return 10;
    }
}
