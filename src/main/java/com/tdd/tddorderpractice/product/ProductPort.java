package com.tdd.tddorderpractice.product;

import org.springframework.stereotype.Component;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(long productId);
}
