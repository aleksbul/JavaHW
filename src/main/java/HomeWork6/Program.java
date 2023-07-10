package HomeWork6;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {

        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat("Tiger", "Bengal", 3, "Male"));
        hashSet.add(new Cat("Tiger", "Bengal", 3, "Male"));
        hashSet.add(new Cat("Milo", "Bombay", 2, "Male"));
        hashSet.add(new Cat("Felix", "Abyssinian", 3, "Female"));
        hashSet.add(new Cat("Ted", "LaPerm", 8, "Male"));
        hashSet.add(new Cat("Max", "Manx", 4, "Female"));
        hashSet.add(new Cat("Felix", "Abyssinian", 3, "Female"));
        hashSet.add(new Cat("Fox", "Maine Coon", 6, "Female"));
        hashSet.add(new Cat("Marta", "Munchkin", 2, "Female"));
        hashSet.add(new Cat("Tiger", "Bengal", 3, "Male"));
        hashSet.add(new Cat("Ace", "Persian", 7, "Male"));


        System.out.println(hashSet);
    }
}
