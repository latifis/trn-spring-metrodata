package fundamental;

public class AritmaticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String kata = "sco";

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println((double) a / b); // biar muncul nilai
        System.out.println( a * b);
        System.out.println(a % b);

//        System.out.println(a+=10);
        System.out.println(++a);
        System.out.println(true);

        // ASSIGNMENT OPERATOR
        System.out.println(a>b);
        System.out.println("assign");
        System.out.println(a==b);
//        System.out.println(a==kata);

        Short c = 10;
        Integer d = 10;

//        System.out.println(c instanceof d); // ini gabisa, tapi kalo kelas sendiri bisa

        // BOOLEAN OPERATION
        if (c<b && c<b){
            System.out.println("ok");
        }

    }
}
