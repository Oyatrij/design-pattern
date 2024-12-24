package com.oyatrij.designpattern.creational.payment;

public class CreditPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("credit payment");
    }
}
