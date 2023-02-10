import java.util.Scanner;

public class mukosayi {
    public static void main(String[] args) {
        int x, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mükemmel Olduğunu Düşündüğünüz Sayıyı Giriniz : ");
        x = input.nextInt();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                total = total + i;
            }
        }
        if (total == x) {
            System.out.println("Evet :) Mükemmel Sayıdır.");
        } else {
            System.out.println("Maalesef :( Mükemel Sayı Değildir.");
        }
    }
}
