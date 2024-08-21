package inheritance;

public class MainCarApp {
    public static void main(String[] args) {

        Car car = new Car();

        car.wheel = 4;
        car.brand = "honda";

        car.specification();
        car.swim();

        Vehicle vehicle = new Vehicle();
//        vehicle.swim(): // ga ada


        // overriding
        System.out.println(car.speed(4));
    }
}
