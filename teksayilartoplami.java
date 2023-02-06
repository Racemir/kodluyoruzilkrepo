import java.util.Scanner;

public class teksayilartoplami {
    public static void main(String[] args) {
        int say, toplam = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz:");
            say = input.nextInt();
            if ((say & 2) == 0 && (say & 4) == 0) {
                toplam += say;
            }
        } while (say % 2 == 1);
        System.out.print("Toplam:" + toplam);
    }
}
