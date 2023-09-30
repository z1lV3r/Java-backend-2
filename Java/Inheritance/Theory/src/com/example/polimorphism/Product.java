package com.example.polimorphism;

public class Product {
    private String name;
    private float price;
    protected String provider;

    public Product(String name, float price, String provider) {
        this.name = name;
        this.price = price;
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    protected void setProvider(String provider) {
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public final String toString() {
        return super.toString() + " [name="+getName()+" price="+getPrice()+" provider="+getProvider()+"]";
    }
}
