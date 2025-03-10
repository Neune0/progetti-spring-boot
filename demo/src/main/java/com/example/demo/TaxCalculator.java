package com.example.demo;

public class TaxCalculator {
    // strong coupling
    private Calculator calculator = new Calculator(); // manual dependency injection

    // rappresenta il calcolo dell'importo totale con l'applicazione di una tassa
    public double applyTax(double amount, double taxRate) {
        return calculator.multiply(amount,taxRate) + amount;
    }

    // rappresenta il calcolo dell'importo totale con l'applicazione di una tassa fissa
    public double calculateTotalWithFixedTax(double amount) {
        return applyTax(amount, 0.2); // tassa fissa del 20%
    }
}
