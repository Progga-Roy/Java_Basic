package first.practice;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a  = ");
        int a = userInput.nextInt();
        System.out.println("Enter b = ");
        int b = userInput.nextInt();
        System.out.println("Enter c = ");
        int c = userInput.nextInt();

        if(a > b && a>c){
            System.out.println(" A is a big number " + a);
        } else if (b>a && b>c) {
            System.out.println(" B is a big number " + b);
        }
//        else if(a==b || a==c || b==c){
//            System.out.println(" this is equal to this " );
//        }
         else{
            System.out.println("C is a big number " + c);
        }
    }
}
