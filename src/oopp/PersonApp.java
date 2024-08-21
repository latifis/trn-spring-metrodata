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

        person1.greetings();
//        person1 = new Person();

        String result = String.format("Hello Mr.%s, age %d, instagram %s", person1.name, person1.age, person1.instagram);

        System.out.println(result);
        System.out.println(person1);

        Person person2 = person1;

        person2.name = "ganti";

        System.out.println(person2.name);
        System.out.println(person2);
        System.out.println(person1.name);

        Person person3 = new Person("latiff", 23, "@ltf");

        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.instagram);

    }
}
