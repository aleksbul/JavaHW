package HomeWork6;

import java.util.Objects;

public class Cat {

    String name;
    String breed;
    int age;
    String gender;

    public Cat() {

    }

    public Cat(String name, String breed, int age, String gender){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return String.format("%s: %s, %d years, %s \n", name, breed, age, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, gender);
    }
}


