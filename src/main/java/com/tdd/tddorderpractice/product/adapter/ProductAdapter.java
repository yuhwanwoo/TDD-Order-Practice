package com.tdd.tddorderpractice.product.adapter;

import com.tdd.tddorderpractice.product.application.port.ProductPort;
import com.tdd.tddorderpractice.product.domain.Product;
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

    @Override
    public Product getProduct(long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }
}
