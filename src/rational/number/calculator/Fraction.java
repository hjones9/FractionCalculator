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
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    public Fraction(int numerator, int denominator) {
        if(denominator == 0){
        throw new IllegalArgumentException("Your denominator cannot be zero.");
        }

        this.denominator = denominator;
        this.numerator = numerator;

    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int newN) {
        this.numerator = newN;
    }

    public void setDenominator(int newD) {
        this.denominator = newD;
    }

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public String toPrettyString(Fraction finalAnswer) {

        String n = Integer.toString(finalAnswer.getNumerator());
        String d = Integer.toString(finalAnswer.getDenominator());

        if (d.equals("1")) {
            return n;
        } else if (this.isZero(finalAnswer)) {
            return "Zero";
        } else {
            return (n + '/' + d);

        }
    }

    public Boolean isZero(Fraction finalAnswer) {
        Boolean test = (finalAnswer.getNumerator() == 0);
        return test;
    }
}
