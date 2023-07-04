package HomeWork5;

public class Program {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Карташёв", "866-15-67");
        phoneBook.add("Ягодина", "104-15-85");
        phoneBook.add("Федоров", "688-55-31");
        phoneBook.add("Карташёв", "183-90-53");
        phoneBook.add("Ясеневский", "797-92-15");
        phoneBook.get("Карташёв");
        phoneBook.get("Ясеневский");

    }
}
