package com.example.inheritance.vs.composition;

public class Chips {
    private final Product product;
    private long expiryDate;
    private long packDate;

    public Chips() {
        this.product = new Product();
    }

    public String getName() {
        return product.getName();
    }

    public void setName(String name) {
        product.setName(name);
    }

    public float getPrice() {
        return product.getPrice();
    }

    public void setPrice(float price) {
        product.setPrice(price);
    }

    public String getProvider() {
        return product.getProvider();
    }

    public void setProvider(String provider) {
        product.setProvider(provider);
    }
    public long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getPackDate() {
        return packDate;
    }

    public void setPackDate(long packDate) {
        this.packDate = packDate;
    }
}
