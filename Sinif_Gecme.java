import java.util.Scanner;

public class Sinif_Gecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,biyoloji,turkce,ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Girniz:");
        mat = input.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.print("biyoloji notunuzu giriniz:");
        biyoloji = input.nextInt();
        System.out.print("fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.print("tükrçe notunuzu giriniz:");
        turkce = input.nextInt();
        ort = (mat+kimya+fizik+biyoloji+turkce) /5;

        if(ort >= 55 && ort <= 100 ){
            System.out.print("Geçerli Ortalama");
        }else if (ort <= 54 && ort >= 0){
            System.out.print("Gçersiz Ortalama");
        }
    }
}
