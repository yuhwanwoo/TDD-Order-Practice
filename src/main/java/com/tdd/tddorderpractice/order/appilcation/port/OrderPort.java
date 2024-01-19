package com.tdd.tddorderpractice.order.appilcation.port;

import com.tdd.tddorderpractice.order.domain.Order;
import com.tdd.tddorderpractice.product.domain.Product;

interface OrderPort {
    Product getProductById(Long productId);

    void save(final Order order);
}
