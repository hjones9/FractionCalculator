/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rational.number.calculator;

import java.util.Scanner;

/**
 *
 * @author Hailey.Jones
 */
public class Input {
    
    private final Scanner in = new Scanner(System.in);
    private Fraction answer;
    private Fraction f1;
    private Fraction f2;
            
            
    public void input(){
    
    System.out.println("This is a fraction calculator. It will multiply your fractions.");
    System.out.println("Please enter the first fraction.");
    String user = in.next();
    f1 = this.parse(user);
        
    System.out.println("Please enter the second fraction.");
    user = in.next();
   f2 = this.parse(user);
    
    }
    
    public void compute(){
    
    Fraction firstanswer = FractionMath.multiply(f1, f2);
    answer = FractionMath.reduce(firstanswer);
    
    }
    
    public Fraction getAnswer(){
    return answer;
    }
    
    private static Fraction parse(String user){
        
        String[] numbersAsStrings = user.split("/");
        
        int numerator = Integer.parseInt(numbersAsStrings[0]);
        int denominator = Integer.parseInt(numbersAsStrings[1]);
        return new Fraction(numerator, denominator);
        
    }
}
