package com.example.association;

import java.util.ArrayList;

public class Seller {
    private final ArrayList<Sell> sells;

    public Seller(ArrayList<Sell> sells) {
        this.sells = sells;
    }
    public Seller() {
        this(new ArrayList<>());
    }
    public void addSell(Sell sell) {
        sells.add(sell);
    }
    public void cleanSells() {
        sells.clear();
    }
}
