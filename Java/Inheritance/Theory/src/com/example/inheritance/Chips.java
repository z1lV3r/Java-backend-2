package com.example.inheritance;

public class Chips extends Product{
    private long expiryDate;

    private long packDate;

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
