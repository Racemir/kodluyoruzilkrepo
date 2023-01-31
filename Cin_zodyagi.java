import java.util.Scanner;

public class Cin_zodyagi {
    public static void main(String[] args) {
        int dogum;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        dogum = input.nextInt();
        if (dogum>0){
            if (dogum%12==0) {
                System.out.print("Çin Zodağı Burcunuz: Maymun");
            }else if(dogum%12==1){
                System.out.print("Çin Zodyağı Burcunuz: Horoz");
            } else if ((dogum&12)==2) {
                System.out.print("Çin Zodyağı Burcunuz: Köpek");
            } else if (dogum%12==3) {
                System.out.print("Çin Zodyağı Burcunuz: Domuz");

            }else if (dogum%12==4) {
                System.out.print("Çin Zodyağı Burcunuz: Fare");

        }else if (dogum%12==5) {
                System.out.print("Çin Zodyağı Burcunuz: Öküz");

    }else if (dogum%12==6) {
                System.out.print("Çin Zodyağı Burcunuz: Kaplan");
}else if (dogum%12==7) {
                System.out.print("Çin Zodyağı Burcunuz: Tavşan");
            }else if (dogum%12==8) {
                System.out.print("Çin Zodyağı Burcunuz: Ejderha");}
            else if (dogum%12==9) {
                System.out.print("Çin Zodyağı Burcunuz: Yılan");}
            else if (dogum%12==10) {
                System.out.print("Çin Zodyağı Burcunuz: At");}
            else if (dogum%12==11) {
                System.out.print("Çin Zodyağı Burcunuz: Koyun");}


        }}

}