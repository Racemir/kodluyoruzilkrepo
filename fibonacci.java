import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int z = 0, y = 1, x = 1;

        for (int i = 0; i <= value; i++) {

            x = z + y;
            System.out.println(z + " + " + y + " = " + x);
            System.out.println("Fibonacci Sayılarım "+z);
            z = y;
            y = x;
        }

    }
}
