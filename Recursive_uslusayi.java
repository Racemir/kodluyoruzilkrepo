import java.util.Scanner;

public class Recursive_uslusayi {
    static int exponential_number(int number) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int temp = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int base = input.nextInt();

        for (int i = 1; i <= base; i++) {
            number = number * temp;
        }
        System.out.print("Sonuc : " + number);
        return 1;
    }

    public static void main(String[] args) {
        exponential_number(1);

    }
}
