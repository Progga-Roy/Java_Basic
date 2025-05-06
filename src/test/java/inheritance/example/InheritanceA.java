package inheritance.example;

import java.util.ArrayList;

public class InheritanceA {
    ArrayList<String> name = new ArrayList<>();
    public void arrayList(){
        name.clear();
        name.add("Rita");
        name.add("Fatima");
        name.add("Salma");
        name.add("Muna");
        name.add("Nabila");
        name.add("Jannat");
        name.add(0,"Samsu");

        ArrayList<String> cloneList = (ArrayList<String>) name.clone();
        System.out.println("Array list size :" + name.size());
        System.out.println("Array list size :" + name);

        System.out.println("Original List: " + name);
        System.out.println("Cloned List: " + cloneList);

    }

    public static void main(String [] args){
        InheritanceA a = new InheritanceA();
//        a.arrayList();
    }
}
