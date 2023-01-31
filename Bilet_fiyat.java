import java.util.Scanner;

public class Bilet_fiyat {
    public static void main(String[] args) {
        int yas,km,yolculuk_tipi,fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km Türünden Giriniz:");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini (1 => Tek Yön/2 => Gidiş Dönüş) Giriniz:");
        yolculuk_tipi = input.nextInt();
        fiyat = km*10/100;

        if (yolculuk_tipi == 1){
            if(km>0){
                if (yas>0){
                    if (12>yas){
                        fiyat = fiyat*50/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    } else if (24>yas && yas>12) {
                        fiyat = fiyat - fiyat*10/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    } else if (yas>65) {
                        fiyat = fiyat - fiyat*30/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    }
                }
                else {System.out.print("Hatalı Giriş Yaptınız");}
            }else {System.out.print("Hatalı Giriş Yaptınız");}

        }
        else if (yolculuk_tipi == 2) {

            fiyat = fiyat*2;
            fiyat = fiyat - fiyat*20/100;

            if(km>0){
                if (yas>0){
                    if (12>yas){
                        fiyat = fiyat*50/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    } else if (24>yas && yas>12) {
                        fiyat = fiyat - fiyat*10/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    } else if (yas>65) {
                        fiyat = fiyat - fiyat*30/100;
                        System.out.print("Toplam Fiyat:"+fiyat);
                    }
                }
                else {System.out.print("Hatalı Giriş Yaptınız");}

            }else {System.out.print("Hatalı Giriş Yaptınız");}

        }
        else {System.out.print("Hatalı Giris Yaptınız");}






    }
}
