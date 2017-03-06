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

        int n1Moment = f1.getNumerator() * f2.getDenominator();
        int d1Moment = f1.getDenominator() * f2.getDenominator();
        int n2Moment = f2.getNumerator() * f1.getDenominator();
        
        int fnumerator = n1Moment + n2Moment;
        int fdenominator = d1Moment;

        return new Fraction(fnumerator, fdenominator);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {

        int fnumerator = f1.getNumerator() * f2.getNumerator();
        int fdenominator = f1.getDenominator() * f2.getDenominator();

        return new Fraction(fnumerator, fdenominator);
    }

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
