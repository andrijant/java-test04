package javaapplication4;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Function F(x, y) = x * y  /  1 - x  + 3
        
        System.out.print("Enter 'x' and 'y' values: ");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double f = x * y / (1 - x) + 3;
        
        System.out.println("F(x, y) = " + f);
    }
    
}
