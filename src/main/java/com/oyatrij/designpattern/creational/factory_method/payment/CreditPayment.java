package com.oyatrij.designpattern.creational.factory_method.payment;

public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("신용카드 결제");
    }
}
