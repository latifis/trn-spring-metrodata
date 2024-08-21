package oopp;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "latif";
        person1.age = 23;
        person1.instagram = "@latif";

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.instagram);

    }
}
