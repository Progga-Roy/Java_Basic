package first.practice;

import java.util.Scanner;

public class ConditionalStringComparison {
    public static void main(String[] args){
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Enter a text 1 = ");
        String text_1 = stringInput.nextLine();
        System.out.println("Enter a text 2 = ");
        String text_2 = stringInput.nextLine();

        if(text_1.equals(text_2)){
            System.out.println("You have entered the same text");
        } else if (text_1.equalsIgnoreCase(text_2)) {
            System.out.println("You have entered the same text but case sensitive");
        }
         else{
            System.out.println("You have entered the different text");
        }
    }
}
