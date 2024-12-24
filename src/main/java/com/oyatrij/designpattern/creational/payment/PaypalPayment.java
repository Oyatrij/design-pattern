package com.oyatrij.designpattern.creational.payment;

public class PaypalPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Paypal payment");
    }
}
