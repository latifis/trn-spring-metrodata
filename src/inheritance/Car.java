package inheritance;

public class Car extends Vehicle {

    void swim(){
        System.out.println("car can swimm noww");
    }

    int speed(int km){
        km+=100;
        return km;
    }
}
