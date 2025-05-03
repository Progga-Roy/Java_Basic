package first.practice;

public class MethodExample {

    int a = 10;
    static int b = 9;
    public void mul(){
        int c = a*b;
        System.out.println("C :" + c);
    }
    public void sum(int a, int b){
        int result = a+b;
        System.out.println("Summation : " + result);
        mul();
    }
    public static void  sub(int a, int b){
        int result = a-b;
        System.out.println("Subtraction : " + result);
    }
    public static void main(String[] args){
    MethodExample obj = new MethodExample();
    obj.sum(23,90);
        sub(10,20);

    }
}
