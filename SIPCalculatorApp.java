package com.projects;

import java.util.Scanner;

public class SIPCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Monthly SIP Amount: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            scanner.next();
        }
        double monthlyInvestment = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            scanner.next();
        }
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Investment Duration (in years): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a whole number.");
            scanner.next();
        }
        int years = scanner.nextInt();
        SIPCalculator sipCalculator = new SIPCalculator(monthlyInvestment, annualRate, years);
        double futureValue = sipCalculator.calculateFutureValue();

        System.out.printf("Future Value of SIP Investment: %.2f\n", futureValue);

        scanner.close();
    }
}
