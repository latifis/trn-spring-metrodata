package abstraction;

public class Cat extends Animal{

    public Cat(String name) {  // buat constructor untuk lebih mudah
        super(name);
    }

    @Override
    void run() {
        System.out.printf("cat %s can run\n",name);
    }

    @Override
    int legs(int total) {
        return total;
    }
}