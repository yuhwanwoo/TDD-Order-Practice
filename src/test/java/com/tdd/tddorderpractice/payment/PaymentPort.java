package com.tdd.tddorderpractice.payment;

import com.tdd.tddorderpractice.order.Order;

interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
