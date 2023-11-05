package com.example.association;

public class Main {
   public static void main(String[] args) {
      Seller seller = new Seller();
      Sell sell1 = new Sell(100);
      Sell sell2 = new Sell(200);
      seller.addSell(sell1);
      seller.addSell(sell2);
   }
}
