package first.practice;

import static first.practice.MethodExample.sub;

public class MethodCalling {
    public void div(int a ,int b){
        int division = a/b;
        System.out.println("Div : " + division);
    }
    public static void main (String[] args){
        MethodExample obj = new MethodExample();
        obj.sum(11,23);
        obj.mul();
        sub(20,12);
        MethodCalling object = new MethodCalling();
        object.div(20,5);
    }
}
