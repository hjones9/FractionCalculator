/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rational.number.calculator;

/**
 *
 * @author Hailey.Jones
 */
public class FractionMath {

    public static Fraction add(Fraction f1, Fraction f2) {

        if (f1.getDenominator() != f2.getDenominator()) {
            throw new IllegalArgumentException("Your fraction must have the same "
                    + "denominators.");
        }

        int fnumerator = f1.getNumerator() + f2.getNumerator();
        int fdenominator = f1.getDenominator();

        return new Fraction(fnumerator, fdenominator);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {

        int fnumerator = f1.getNumerator() * f2.getNumerator();
        int fdenominator = f1.getDenominator() * f2.getDenominator();

        return new Fraction(fnumerator, fdenominator);
    }

    //re-set answer. It's only setting this.numerator.
    public static Fraction reduce(Fraction answer) {
        int n = answer.getNumerator();
        int d = answer.getDenominator();
        int t;
        if (n >= d) {
            t = n;
        } else {
            t = d;
        }

        do {
            if (((n % t) == 0) && ((d % t) == 0)) {
                n = n / t;
                d = d / t;
            } else {
                t--;
            }

        } while (t > 1);
        int newN = n;
        int newD = d;
        return new Fraction(newN, newD);
    }

}
