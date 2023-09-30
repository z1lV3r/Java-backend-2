package com.example.inheritance;

public class Vegetable extends Product{
    private long expiryDate;

    private long harvest;

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
