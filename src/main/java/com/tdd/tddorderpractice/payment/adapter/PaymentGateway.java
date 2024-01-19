package com.tdd.tddorderpractice.payment.adapter;

interface PaymentGateway {

    void execute(int totalPrice, String cardNumber);
}
