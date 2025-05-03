package first.practice;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int a = userInput.nextInt();

        System.out.println("Enter another number = ");
        int b = userInput.nextInt();

        int  c = a+b;
        int  d = a-b;
        int  e = a/b;
        int f = a*b;

        System.out.println("Addition = " + c + "\n" + "Subtraction = " + d + "\n" + "Division = " + e + "\n"  + "Multiplication = " + f );
    }
}

