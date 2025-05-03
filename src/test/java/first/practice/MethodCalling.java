package first.practice;

import static first.practice.MethodExample.sub;

public class MethodCalling {
    public static void main (String[] args){
        MethodExample obj = new MethodExample();
        obj.sum(11,23);
        obj.mul();
        sub(20,12);
    }
}
