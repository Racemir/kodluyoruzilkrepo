import java.util.Scanner;

public class Artıkyıl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz:");
        int yıl = input.nextInt();
        if (yıl>0){
            if (yıl%4==0 && yıl%100==0){
                if (yıl%400==0){
                System.out.print(yıl+" Artık Yıldır");}
            }else

            {System.out.print(yıl+" Artık Yıl Değildir");}
        }
    }
}
