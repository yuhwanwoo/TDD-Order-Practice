package com.tdd.tddorderpractice.product.application.port;

import com.tdd.tddorderpractice.product.domain.Product;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(long productId);
}
