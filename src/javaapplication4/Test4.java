package javaapplication4;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                
        System.out.print("Enter number: ");
        double x = s.nextDouble();
        
        double f1 = Math.sqrt(x);  // square root         
        System.out.println("Square root of number " + x + " is: " + f1);
       
        double f2 = Math.pow(x, 3.0);  // power of number
        System.out.println("Number " + x + " to the power of 3 is: " + f2);
              
        double f3 = Math.abs(x);
        System.out.println("Absolute value of number " + x + " is: " + f3);
        
        double f4 = Math.PI * x;
        System.out.println("PI value of number " + x + " is: " + f4);
        
    }
    
}
