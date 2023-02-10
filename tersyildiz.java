import java.util.Scanner;

public class tersyildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, y, tempnumber, x;

        number = input.nextInt();
        tempnumber = number;
        for (int i = 0; number >= i; i++) {
            y = 0;
            x = tempnumber + (tempnumber - 1);
            tempnumber--;

            for (int k = 1; k <= (i + 1); k++) {
                System.out.print(" ");
            }
            while (x > y) {
                System.out.print("*");
                y++;
            }
            System.out.println(" ");
        }

    }
}


