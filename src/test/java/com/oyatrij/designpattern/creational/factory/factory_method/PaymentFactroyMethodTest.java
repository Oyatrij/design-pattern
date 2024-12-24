package com.oyatrij.designpattern.creational.factory.factory_method;

import com.oyatrij.designpattern.creational.factory_method.payment.factory.CreditPaymentFactoryImpl;
import com.oyatrij.designpattern.creational.factory_method.payment.CreditPayment;
import com.oyatrij.designpattern.creational.factory_method.payment.Payment;
import com.oyatrij.designpattern.creational.factory_method.payment.factory.CreditPaymentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentFactroyMethodTest {
    @Test
    void createCreditPayment() {
        //Given
        CreditPaymentFactory creditPaymentFactory = new CreditPaymentFactoryImpl();

        //When
        CreditPayment creditPayment = creditPaymentFactory.createCreditPayment();

        //Then
        Assertions.assertInstanceOf(Payment.class, creditPayment);
    }
}
