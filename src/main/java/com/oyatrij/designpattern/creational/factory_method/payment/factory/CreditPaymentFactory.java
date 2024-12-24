package com.oyatrij.designpattern.creational.factory_method.payment.factory;

import com.oyatrij.designpattern.creational.factory_method.payment.Payment;

public interface CreditPaymentFactory {
    Payment createPayment();
}
