package edu.guilford;

import java.util.Random;

public class Rational {

    Random rand = new Random();

    // attributes

    private int numerator;
    private int denominator;

    // constructors

    public Rational() {
        while (denominator == 0) {
            numerator = rand.nextInt(201) - 100;
            denominator = rand.nextInt(201) - 100;
        }
    }

    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero.");
        }
    }

    // toString method

    public String toString() {
        return numerator + "/" + denominator;
    }

    // negate method

    public void negate() { // This is a void because there is no new value created or stored. The change is
                           // reflected in the object itself.
        numerator = -numerator;
    }

    // invert method

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // toDouble method

    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Find the GCD of the numerator and denominator

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }

    // Divide the numerator and denominator by the GCD

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // Method to add two rational numbers

    public Rational add(Rational r) {
        int newNumerator = (numerator * r.denominator) + (r.numerator * denominator);
        int newDenominator = denominator * r.denominator;
        Rational newRational = new Rational(newNumerator, newDenominator);
        newRational.reduce();
        return newRational;
    }

}
