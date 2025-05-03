package first.practice;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value : ");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Enter a string : ");
        String name = input.nextLine();

        System.out.println("Enter a boolean value :");
        boolean value = input.nextBoolean();

        System.out.println("Enter float number = ");
        float num =input.nextFloat();
        System.out.println("Enter a string : ");
        String name2 = input.nextLine();

        System.out.println("Integer number = " + number  + "\n" + "A string = " + name2 + "\n" + "A boolean = " + value + "\n" + " Float num = " + num + "\n" + " name2 = " + name2);

    }
}
