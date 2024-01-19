package com.tdd.tddorderpractice.order.adapter;

import com.tdd.tddorderpractice.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
