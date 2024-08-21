package abstraction;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void run();
    abstract int legs(int total);

}
