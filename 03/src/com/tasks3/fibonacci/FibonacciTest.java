package com.tasks3.fibonacci;

public class FibonacciTest {
    public static void main(String[] args) {
        long value = 0;
        

        Fibonacci fibonacci = new Fibonacci();
        
        for (int i = -9; i < 9; i++) {
            value = fibonacci.getNumber(i);
            System.out.println("fibonacci position " + i + " is " + value);
        }
    }
}
