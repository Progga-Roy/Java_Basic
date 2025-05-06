package inheritance.example;

public class InheritanceC extends InheritanceB {
    public static void main(String[] args){
        InheritanceC c = new InheritanceC();
         display();
        c.name.add("Resma");
        c.arrayList();
         String replaceArray = c.name.set(3,"Progga");
        System.out.println("Replace array : " + replaceArray);
        c.arrayList();
    }
}
