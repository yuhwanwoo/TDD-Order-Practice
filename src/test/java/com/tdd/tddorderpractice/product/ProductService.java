package com.tdd.tddorderpractice.product;

public class ProductService {
    private final ProductServiceTest productServiceTest;
    private final ProductPort productPort;

    public ProductService(ProductServiceTest productServiceTest, ProductPort productPort) {
        this.productServiceTest = productServiceTest;
        this.productPort = productPort;
    }

    public void addProduct(final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());

        productPort.save(product);
    }
}
