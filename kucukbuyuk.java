import java.util.Scanner;

public class kucukbuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, tempnumber1 = 0, tempnumber2 = 0, max = 0, min = 0, countnumber, x = 1, y = 0;
        boolean status = true;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        countnumber = input.nextInt();
        do {
            if (x <= countnumber) {
                System.out.print(x + ". Sayıyı Giriniz : ");
                number = input.nextInt();
                x++;
                if (y == 0) {
                    tempnumber2 = number;
                    y++;
                }
                if (number <= tempnumber2) {
                    tempnumber2 = number;
                    min = tempnumber2;
                }
                if (number >= tempnumber1) {
                    tempnumber1 = number;
                    max = tempnumber1;
                }
            } else {
                status = false;
            }

        } while (status);
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);


    }
}
