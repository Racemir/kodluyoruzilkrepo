import java.util.Scanner;

public class odev3ve4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say, ort, sayac = -1, toplam = 0;
        System.out.print("Sayı Giriniz:");
        say = input.nextInt();
        for (int i = 0; i <= say; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sayac += 1;
                System.out.println(i);
                toplam += i;
            }
        }
        ort = toplam / sayac;
        System.out.print("Ortalama:" + ort);


    }
}
