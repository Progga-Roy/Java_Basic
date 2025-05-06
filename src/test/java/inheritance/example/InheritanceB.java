package inheritance.example;

public class InheritanceB extends InheritanceA {
//   static int [] num = {45,67,23,67,89,46,98};
//  static int sum =0;
    public static void display(){
        int [] num = {45,67,23,67,89,46,98};
        int sum =0;
       for(int i =0;i<num.length;i++){
           sum = num[i]+sum;
           System.out.println("Arrays: " + num[i]);
       }
        System.out.println("Length :" + num.length);
        System.out.println("Sum :" + sum);

    }
    public static void main(String[] args){
//        display();
        InheritanceB b = new InheritanceB();
        b.arrayList();
    }
}
