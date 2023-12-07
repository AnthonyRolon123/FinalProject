package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 100;

        System.out.println("The value for 10 is: " + Fib(n));
    }

    public static int Fib(int n) {
        if(n ==1){return 1;}
        return n * Fib(n-1);
    }
}