package com.example.aggregation;

public class Product {
    private final Provider provider;
    public Product(Provider provider) {
        this.provider = provider;
    }
    public Provider getProvider() {
        return provider;
    }
}
