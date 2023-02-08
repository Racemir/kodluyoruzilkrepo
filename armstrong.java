import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int say = input.nextInt();
        int bassayi = 0, tempsay = say, basvalue, basus,toplam = 0;

        while (tempsay != 0) {
            tempsay /= 10;
            bassayi++;
        }
        System.out.println("basamak sayısı : " + bassayi);
/*
        tempsay = say;
        while (tempsay != 0) {
            basvalue = tempsay % 10;
            basus =1;
            for (int i = 1; i <= bassayi; i++) {
                basus = basus + basvalue;
            }
            toplam += basus;
            tempsay = tempsay / 10;

        }
        if (toplam == say){
            System.out.print("bu sayı armstrong sayıdır : ");
        }else {
            System.out.print("armstrong sayı değildir : ");
        }
        System.out.println(toplam);
        */
    }
}
