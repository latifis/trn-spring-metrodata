package oopp;

public class Person {

    // ATRIBUT / entitas
    String name;
    int age;
    String instagram;

    // METHOD / behavior
    void greetings(){
        System.out.println(String.format("Hello Mr.%s, age %d, instagram %s", name, age, instagram));
//        System.out.printf(name);
    }

    // CONSTRUCTOR

    Person(){   // CONSTRUCTOR DEFAULT

    }

    // shortcut -> (alt + insert)
    public Person(String name, int age, String instagram) {
        this.name = name;
        this.age = age;
        this.instagram = instagram;
    }

    // Custom
    public Person(String name) {
        this.name = name;
        this.age = 21;
        this.instagram = "instagram";
    }
}
