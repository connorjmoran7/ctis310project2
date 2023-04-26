package edu.guilford;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Rational firstNum = new Rational();

        System.out.println("Testing Rational class methods:");
        System.out.println("\nTesting toString method: " + firstNum.toString());

        // Declare a new rational number with a numerator of 5 and a denominator of 10
        System.out.println("\nSecond number declared: 5/10");
        Rational secondNum = new Rational(5, 10);

        // Flip the sign of the rational number
        secondNum.negate();

        System.out.println("\nTesting negate method:");
        // Print out the negated number
        System.out.println(secondNum.toString());

        // Invert the rational number
        secondNum.invert();

        System.out.println("\nTesting invert method:");
        // Print out the inverted number
        System.out.println(secondNum.toString());

        System.out.println("\nTesting toDouble method:");
        // Print out the rational number as a double
        System.out.println(secondNum.toDouble());

        System.out.println("\nTesting GCD method:");
        // Print out the GCD of the numerator and denominator
        System.out.println(secondNum.gcd(5, 10));

        System.out.println("\nTesting reduce method:");
        // Simplify the rational number
        secondNum.reduce();

        // Print out the simplified rational number
        System.out.println(secondNum.toString());

        // By this point, a new random rational number has been generated, and the
        // methods will be tested
        System.out.println("\nTesting addition method:");

        System.out.println("\nInput: " + firstNum.toString() + " and " + secondNum.toString() +
                "\nExpected Output: " + firstNum.add(secondNum).toString());

        System.out.println("\nProgram Output: ");
        System.out.println("The sum of " + firstNum.toString() + " and " + secondNum.toString() +
                " is " + firstNum.add(secondNum).toString() + ".");

    }
}
