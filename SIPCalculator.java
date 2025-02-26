package com.projects;

class SIPCalculator {
    private double monthlyInvestment;
    private double annualRate;
    private int years;

    public SIPCalculator(double monthlyInvestment, double annualRate, int years) {
        this.monthlyInvestment = monthlyInvestment;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateFutureValue() {
        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;
        return monthlyInvestment * ((Math.pow(1 + monthlyRate, months) - 1) / monthlyRate) * (1 + monthlyRate);
    }
}
