package com.oyatrij.designpattern.creational.factory_method.payment;

import com.oyatrij.designpattern.creational.payment.Payment;

public class PaypalPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("페이팔 결제");
    }
}
