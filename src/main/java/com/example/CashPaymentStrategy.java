package com.example;

public class CashPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(String amount){
        System.out.println("Customer pays the money "+amount+" Rs By Cash");
    }
}
