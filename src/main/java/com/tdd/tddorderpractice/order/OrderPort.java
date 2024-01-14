package com.tdd.tddorderpractice.order;

import com.tdd.tddorderpractice.product.Product;

interface OrderPort {
    Product getProductById(Long productId);

    void save(final Order order);
}
