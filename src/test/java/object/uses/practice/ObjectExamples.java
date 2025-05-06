package object.uses.practice;

import java.util.Scanner;

public class ObjectExamples {

    public void StringCompare(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String text =  input.nextLine();
        System.out.println("Enter a string : ");
        String text2 =  input.nextLine();
        if(text.equals(text2)){
            System.out.println("Entered same text");
        }
        else{
            System.out.println("Entered different text");
        }
    }
    public static void main(String[] args){
        ObjectExamples obj = new ObjectExamples();
        obj.StringCompare();

    }
}
