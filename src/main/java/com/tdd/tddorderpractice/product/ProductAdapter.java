package com.tdd.tddorderpractice.product;

import org.springframework.stereotype.Component;

@Component
public class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    public ProductAdapter(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}