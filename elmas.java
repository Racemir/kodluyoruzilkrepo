import java.util.*;

public class elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tek Sayı Giriniz :");
        int n = input.nextInt();

        if (n % 2 == 1) {
            n = n / 2;

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = 0; i <= n; i++) {
                for (int k = 1; k <= (i + 1); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < 2 * (n - i); j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else {
            while (n % 2 == 0) {
                System.out.print("Yanlış değer Girdiniz\nTek sayı giriniz : ");
                n = input.nextInt();
            }
            n = n / 2;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = 0; i <= n; i++) {
                for (int k = 1; k <= (i + 1); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < 2 * (n - i); j++) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        }
    }
}