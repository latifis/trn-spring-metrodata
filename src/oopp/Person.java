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

}
