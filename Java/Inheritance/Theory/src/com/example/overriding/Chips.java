package com.example.overriding;

public class Chips extends Product {
    private long expiryDate;

    private long packDate;

    private char[] provider;

    public Chips(String name, float price, long expiryDate, long packDate, char[] provider) {
        super(name, price, String.valueOf(provider));
        this.expiryDate = expiryDate;
        this.packDate = packDate;
        this.provider = provider;
    }

    @Override
    public String getProvider() {
        return String.valueOf(provider);
    }

    @Override
    public void setProvider(String provider) {
        super.setProvider(provider);
        this.provider = provider.toCharArray();
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
