package prostiechisla;
import java.util.Scanner;

public class ProstieChisla {

    public static void main(String[] args) {

        System.out.println("Введите число ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean R = true;


        System.out.println("Простые числа: ");

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    R = false;
                    break;
                }
            }

            if (R==true) {
                System.out.println(i);
            }

            R = true;
        }


    }
}