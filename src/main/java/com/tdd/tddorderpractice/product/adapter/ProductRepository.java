package com.tdd.tddorderpractice.product.adapter;

import com.tdd.tddorderpractice.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
