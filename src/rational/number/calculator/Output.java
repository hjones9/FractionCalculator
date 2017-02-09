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
public class Output {

    public void outputAddition(Fraction answer) {
        Fraction fix = new Fraction();
        String finalAnswer = fix.toPrettyString(answer);

        System.out.println("The solution of your fractions is: " + finalAnswer);

    }

    public void outputMultiplication(Fraction finalAnswer) {
        Fraction fix = new Fraction();
        String lastAnswer = fix.toPrettyString(finalAnswer);

        System.out.println("The product of your fractions is: " + lastAnswer);

    }
}
