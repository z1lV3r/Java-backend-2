package com.example.inheritance.vs.composition;

public class BathArticle {
    private final Product product;
    private String material;

    public BathArticle() {
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
