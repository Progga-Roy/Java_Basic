package first.practice;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        // ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        //names add
        name.add("Rubban");
        name.add("Rahim");
        name.add("Kotkoti");
        name.add("Rina Khan");
        name.add("Karim");
        name.add("Rubel");
        System.out.println("Array List : " + name);
        System.out.println(" Array List : " +name.size());
        System.out.println("Is array list empty ? : " + name.isEmpty());
        System.out.println("Find the index value : " + name.get(3));
        // remove with index number
        name.remove(3);
        System.out.println("Array List : " + name);
//        name.clear();
//        System.out.println("Array List : " + name);

        for(String names : name){
            System.out.println(names);
        }

    }
}
