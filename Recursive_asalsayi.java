import java.util.Scanner;

public class Recursive_asalsayi {
    static int primeNumber(int number) {
        Scanner input = new Scanner(System.in);

            System.out.print("Bir Sayı Giriniz : ");
            int tempnumber = input.nextInt();

            for (int i = 2; i <= tempnumber; i++) {
                if (tempnumber == 2) {
                    System.out.print(tempnumber + " Sayısı Asaldır.");
                    break;
                } else if (tempnumber % i == 0) {
                    System.out.print(tempnumber + " Sayısı Asal Değildir.");
                    break;
                } else {
                    System.out.print(tempnumber + " Sayısı Asaldır.");
                    break;
                }

            }


        return 1;
    }

    public static void main(String[] args) {
        primeNumber(1);

    }
}
