package com.oyatrij.designpattern.creational.payment;

public interface PaymentFactory {
    Payment createPayment(String paymentType);
}
