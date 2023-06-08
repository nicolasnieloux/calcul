package org.example;

public class Calculator {

    private int a;
    private int b;

    private int result;

    public int add(int a, int b) {
        return a + b;
    }

    public String divise(int a, int b) {
        if (b == 0) {
            return ("division par zero impossible");
        } else {
            return String.valueOf(a / b);
        }
    }

    public int divise2(int a, int b) throws ArithmeticException {
        return a/b;
    }
}
