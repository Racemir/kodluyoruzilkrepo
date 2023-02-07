import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        int x, y, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        x = input.nextInt();
        System.out.print("üssü olacak sayı : ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        System.out.print("Cevap : "+total);

    }
}
