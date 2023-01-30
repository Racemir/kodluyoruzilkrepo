import java.util.Scanner;

public class Hesap_makinesi {
    public static void main(String[] args) {
        int s1, s2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        s2 = input.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiniz:");
        select = input.nextInt();

        switch (select){
            case 1:
                select = s1 + s2 ;
                System.out.print(select);
                break;
            case 2:
                select = s1-s2;
                System.out.print(select);
                break;
            case 3:
                select = s1*s2;
                System.out.print(select);
                break;
            case 4:
                select = s1/s2;
                System.out.print(select);
                break;
            default:
                System.out.print("Geçerli Bir Seçim Değil\nTekrar Deneyiniz ");

        }
    }
}

