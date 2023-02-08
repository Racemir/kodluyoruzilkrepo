import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1;
        System.out.print("sayı giriniz : ");
        int number1 = input.nextInt();
        System.out.print("sayı giriniz : ");
        int number2 = input.nextInt();
        int i = 1; //Ekok için geçerli
// Ekok Hesaplama
        /*
        while (i <= (number2 * number1)) {
            if (i % number2 == 0 && i % number1 == 0) {
                System.out.print("Ekok : " + i);
            }
            i++;
        }
*/
//Ebob Hesaplama

        int x = number1;
        if (number2 > number1) {
            while (x >= 1) {
                if (number2 % x == 0 && number1 % x == 0) {
                    ebob = x;
                    System.out.print("Ebob : " + ebob);
                    break;
                }
                x--;
            }

        } else {
            int j = number2;
            while (i >= 1) {
                if (number1 % j == 0 && number2 % j == 0) {
                    ebob = j;
                    System.out.print("Ebob : " + ebob);
                    break;
                }
                j--;
            }

        }
    }
}
