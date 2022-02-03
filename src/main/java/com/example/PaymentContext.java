package com.example;

public class PaymentContext {

    private IPaymentStrategy paymentStrategy;
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public IPaymentStrategy getPaymentStrategy(){
        return paymentStrategy;
    }
    public void pay(String amount){
        paymentStrategy.pay(amount);
    }
}
