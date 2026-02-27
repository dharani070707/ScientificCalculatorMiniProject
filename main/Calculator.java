package com.example;
import java.util.Scanner;

public class Calculator {

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    System.out.println(squareRoot(sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    System.out.println(factorial(sc.nextInt()));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    System.out.println(naturalLog(sc.nextDouble()));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double b = sc.nextDouble();
                    System.out.println(power(a, b));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
