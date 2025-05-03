package first.practice;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
//        for(int i = 0; i<10; i++){
//            System.out.println(" i = " + i);
//        }
//        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i<numbers.length; i++){
//            System.out.println("i = " + numbers[i]);
//        }
//        System.out.println("Array length :" + numbers.length);

//        forEach
//        for(int number : numbers){
//            System.out.println("Count : " + number);
//        }

//Even number
//        for(int i=0; i<20;i++){
//            if(i%2==0){
//                System.out.println("Even = " + i);
//            }
//        }

        //Odd number
//        for(int i=1; i<20;i++){
//            if(i%2!=0){
//                System.out.println("Odd = " + i);
//            }
//        }

        //Number Table
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        for(int i =1; i<=10; i++){
//            int result  = num*i;
//            System.out.println("Result = " + result);
              System.out.println(num + "*" + i + "=" + num*i);
        }

    }
}
