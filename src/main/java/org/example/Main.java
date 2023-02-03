package org.example;

import org.w3c.dom.ranges.RangeException;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {

        //Рекурсия и рекурсивное доказательство
        //Рекурсивный => Итерационный

        //      1) База рекурсии;
        //      2) Рекурсивное предположение;
        //      3)* Рекурсивный переход;

        // Factorial(n) = n * (n - 1) * (n - 2) * (n - 3) ... *1;

        // Factorial(5) = 5 * 4 * 3 * 2 * 1 = 20 * 6 = 120;
        // Factorial(3) = 3 * 2 * 1 = 6;
        // Factorial(2) = 2 * 1 = 2;
        // Factorial(1) = 1;

        // Scrum planning =>Planning Pocker => последовательность Фиббоначи

        // F(0) = 1;
        // F(1) = 1;
        // F(2) = F(1) + F(0);
        // F(3) = F(2) + F(1);
        // F(n) = F(n - 1) + F(n - 2);

        System.out.println("factorial = " + factorial(5));

        System.out.println("factorialR = " + factorialR(5));

        // 5 * factorialR(4)
        // 4 * factorialR(3)
        // 3 * factorialR(2)
        // 2 * factorialR(1)
        // 1 * factorialR(0)
        // 1
        // 5 * 4 * 3 * 2 * 1 * 1 = 120

        System.out.println("fibR = " + fibR(5));
        // fibR(4) + fibR(3)
        // fibR(3) + fibR(2) + fibR(2) + fibR(1) = 1
        // fibR(2) + fibR(1) = 1 + fibR(2) + fibR(2) + fibR(1) = 1
        // 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8

        System.out.println("fib = " + fib(5));
    }

    static long factorial(int n) {
        if (n < 0) {
            throw new InvalidParameterException();
        }
        if (n > 31) {
            throw new StringIndexOutOfBoundsException();
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long factorialR(int n) {
        if (n < 0) {
            throw new InvalidParameterException();
        }
        if (n > 31) {
            throw new StringIndexOutOfBoundsException();
        }
        if (n == 0)
            return 1;
        return n * factorialR(n - 1);
    }

    static int fibR(int n) {
        if (n < 0) {
            throw new InvalidParameterException();
        }
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fibR(n - 1) * fibR(n - 2);
    }

    static int fib(int n) {
        int[] fib = new int[n + 1];
        if (n < 0) {
            throw new InvalidParameterException();
        }
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}