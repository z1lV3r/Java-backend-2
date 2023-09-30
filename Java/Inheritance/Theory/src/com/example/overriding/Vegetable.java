package com.example.overriding;

public final class Vegetable extends Product {
    private final long expiryDate;

    private long harvest;

    public Vegetable(String name, float price, String provider, long expiryDate, long harvest) {
        super(name, price, provider);
        this.expiryDate = expiryDate;
        this.harvest = harvest;
    }

    /* Commented to avoid re-assigning final variable value error
    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }
     */

    public long getExpiryDate() {
        return expiryDate;
    }

    public long getHarvest() {
        return harvest;
    }

    public void setHarvest(long harvest) {
        this.harvest = harvest;
    }

    /* Commented to avoid overriding final method error
    @Override
    public String toString() {
        return super.toString();
    }
     */
}
