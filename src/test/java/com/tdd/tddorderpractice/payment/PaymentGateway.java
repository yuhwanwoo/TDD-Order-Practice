package com.tdd.tddorderpractice.payment;

interface PaymentGateway {

    void execute(int totalPrice, String cardNumber);
}
