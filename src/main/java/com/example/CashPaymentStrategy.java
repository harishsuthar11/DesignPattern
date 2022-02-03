package com.example;

public class CashPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(float amount){
        System.out.println("Customer pays the money "+amount+" Rs By Cash");
    }
}
