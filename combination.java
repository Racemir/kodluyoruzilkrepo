import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        int n, r, nf = 1, rf = 1, C, f, ff = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nf = nf * i;
        }
        System.out.println("N faktöriyel : " + nf);

        System.out.print("r değerini giriniz : ");
        r = input.nextInt();

        for (int j = 1; j <= r; j++) {
            rf *= j;
        }
        System.out.println("R faktöriyel : " + rf);

        f = n-r;
        for (int x = 1; x <= f; x++) {
            ff *= x;
        }
        System.out.println("n-r Faktöriyel : "+ff);

        C = nf / (rf * ff);
        System.out.print("C("+n+"-"+r+")"+" : "+C );


    }
}
