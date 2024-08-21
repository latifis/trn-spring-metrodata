public class Method {
    public static void main(String[] args) {
//        Method.greetings();
        greetings("Cowok");
        System.out.println(sum(1,2));
        sayCongrats("Johan", 90,88,67,70,90);
    }


    public static void greetings(String name){
        System.out.println("Hello " + name);
    }

    // static itu bisa digunakan di class nya sendiri,
    // juga

    public static int sum(int n1, int n2) { // naming camel case
        return n1 + n2;
    }

    // Method Variable Argument
    public static void sayCongrats(String name, int... nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }

        double finalValue=total/nilai.length;

        if (finalValue >= 80) {
            System.out.printf("Congrats %s you passed 🎉 with score : %f", name, finalValue);
        }else {
            System.out.printf("Sorry %s you didn't pass", name);
        }
    }
}
