package inheritance;

public class Car extends Vehicle {

    void swim(){
        System.out.println("car can swimm noww");
    }

    int speed(int km){
        km+=100;
        return km;
    }

    // Overloading
    int speed(int km, int cek){
        km+=cek;
        return km;
    }
}
