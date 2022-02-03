package com.example;

public class DebitCardStrategy implements IPaymentStrategy {
    @Override
    public void pay(float amount){
        System.out.println("Customer pays the money "+amount+" Rs using debit Card");
    }
}
