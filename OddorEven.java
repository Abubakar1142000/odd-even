import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        System.out.print("Enter any Integer =");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        } else {
            System.out.print("Enter Valid Integer");
        }
        sc.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
