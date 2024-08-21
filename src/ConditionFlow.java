public class ConditionFlow {
    public static void main(String[] args) {
        // IF STATEMENT
        int finalExam = 60;
        int exam = 60;

        if (finalExam >= 80 && exam >= 85) {
            System.out.println("Nilai Anda A");
        } else if (finalExam >= 70 && exam >= 75) {
            System.out.println("Nilai Anda B");
        } else if (finalExam >= 60 && exam >= 65) {
            System.out.println("Nilai Anda C");
        } else if (finalExam >= 50 && exam >= 55){
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

        // SWITCH
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Selamat anda lulus dengan nilai memuaskan");
                break;
            case 'B':
                System.out.println("Selamat anda lulus dengan nilai memuaskan 2");
            case 'C':
                System.out.println("Selamat anda lulus dengan nilai cukup");
                break;
            case 'D':
                System.out.println("Selamat anda lulus");
                break;
            default:
                System.out.println("Maaf anda tidak lulus");
        }

        // SWITCH LAMDA

        switch (grade) {
            case 'A' -> {
                System.out.println("Selamat anda lulus dengan nilai memuaskan");
                System.out.println("Selamat anda lulus dengan nilai memuaskan");
                System.out.println("Selamat anda lulus dengan nilai memuaskan");
            }
            case 'B', 'C' -> System.out.println("Selamat anda lulus dengan nilai cukup");
            case 'D' -> System.out.println("Selamat anda lulus");
            default -> System.out.println("Maaf anda tidak lulus");
        }

        // TERNARY OPERATION
        int nilai = 90;
        String result = nilai >= 80 ? "Selamat and lulus" : "Maaf anda tidak lulus";
        System.out.println(result);
    }
}
