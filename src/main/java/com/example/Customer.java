package com.example;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        System.out.println("Please enter Payment Type:'CreditCard' Or 'Debit card' Or 'Cash'");
        Scanner scanner = new Scanner(System.in);
        String paymentType = scanner.next();
        System.out.println("Payment Type is "+paymentType);

        System.out.println("\n Please enter amount to Pay");
        Scanner scanner1 = new Scanner(System.in);
        String amount = scanner.next();
        System.out.println("Amount is"+amount);

        PaymentContext paymentContext = new PaymentContext();

        if("CreditCard".equalsIgnoreCase(paymentType)){
            paymentContext.setPaymentStrategy(new CreditCardStrategy());
        }
        else if("DebitCard".equalsIgnoreCase(paymentType)){
            paymentContext.setPaymentStrategy(new DebitCardStrategy());
        }
        else if("Cash".equalsIgnoreCase(paymentType)){
            paymentContext.setPaymentStrategy(new CashPaymentStrategy());
        }
        System.out.println("Payment Context is "+paymentContext.getPaymentStrategy());
        paymentContext.pay(amount);

    }
}
