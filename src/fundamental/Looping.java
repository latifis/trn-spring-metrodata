package fundamental;

public class Looping {
    public static void main(String[] args) {

        // FOR I (shordcut -> fori)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] arr = new String[10];

        // FOR EACH / Enhanced For Loop
        for (String array : arr){
            System.out.println(array);
        }

//        for (init statement; kondisi; post statement) {
//            // Block Perulangan
//        }

        // WHILE LOOP
        int count = 0;

        while (count <=5 ){
            System.out.println("Count is: " + count);
            count++;
        }

        // DO WHILE LOOP
        count = 0;

        do {
            System.out.println("Count is: "+ count);
            count++;
        }while (count <= 5);

    }
}
