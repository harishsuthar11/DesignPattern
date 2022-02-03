package com.example;

public class DebitCardStrategy implements IPaymentStrategy {
    @Override
    public void pay(String amount){
        System.out.println("Customer pays the money "+amount+" Rs using debit Card");
    }
}
