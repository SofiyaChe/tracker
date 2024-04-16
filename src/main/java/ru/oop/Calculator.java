package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int devide(int z) {
        return z / x;
    }

    public int sumAllOperation(int z) {
        return sum(z) + multiply(z) + minus(z) + devide(z);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        Calculator.sum(5);
        Calculator.minus(5);
        calculator.devide(5);
        calculator.sumAllOperation(5);
    }
}
