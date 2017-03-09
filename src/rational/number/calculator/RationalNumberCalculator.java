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
public class RationalNumberCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add a divide option?
        //Add a subtract option?
     Input input = new Input();
     input.input();
     input.compute();
     Output output = new Output();
     Fraction finalAnswer = input.getAnswer();
     output.outputMultiplication(finalAnswer);
     
    }
    
}
