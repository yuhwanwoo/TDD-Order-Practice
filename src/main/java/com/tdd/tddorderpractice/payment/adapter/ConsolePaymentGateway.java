package com.tdd.tddorderpractice.payment.adapter;

import org.springframework.stereotype.Component;

@Component
public class ConsolePaymentGateway implements PaymentGateway {
    @Override
    public void execute(int totalPrice, String cardNumber) {

    }
}
