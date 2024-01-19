package com.tdd.tddorderpractice.payment.application.port;

import com.tdd.tddorderpractice.order.domain.Order;
import com.tdd.tddorderpractice.payment.domain.Payment;

interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
