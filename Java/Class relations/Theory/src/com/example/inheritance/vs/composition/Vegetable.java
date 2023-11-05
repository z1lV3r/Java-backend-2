package com.example.inheritance.vs.composition;

public class Vegetable {
    private final Product product;
    private long expiryDate;
    private long harvest;
    public Vegetable() {
        product = new Product();
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

    public long getHarvest() {
        return harvest;
    }

    public void setHarvest(long harvest) {
        this.harvest = harvest;
    }
}
