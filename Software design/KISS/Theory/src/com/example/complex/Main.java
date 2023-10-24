package com.example.complex;

public class Main {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();

      int num1 = 10;
      int num2 = 20;

      int result1 = calculator.add(num1, num2);
      int result2 = calculator.subtract(num1, num2);
      int result3 = calculator.multiply(num1, num2);
      int result4 = calculator.divide(num1, num2);

      System.out.println("Addition result: " + result1);
      System.out.println("Subtraction result: " + result2);
      System.out.println("Multiplication result: " + result3);
      System.out.println("Division result: " + result4);
   }
}