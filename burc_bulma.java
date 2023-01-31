import java.util.Scanner;

public class burc_bulma {
    public static void main(String[] args) {
        String ay;
        int gun;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Ayınızı Giriniz:");
        ay = input.nextLine();
        System.out.print("Doğum Gününüzü Giriniz:");
        gun = input.nextInt();

        String kucuk_ay = ay.toLowerCase();

        if (((kucuk_ay.equals("mart")) && (30 >= gun && gun >= 21)) || ((kucuk_ay.equals("nisan")) && (20 >= gun && gun >= 1))){
            System.out.print("Koç Burcusun");
        }
        if (((kucuk_ay.equals("nisan")) && (30 >= gun && gun >= 21)) || ((kucuk_ay.equals("mayıs")) && (21 >= gun && gun >= 1))){
            System.out.print("Boğa Burcusun");
        }
        if (((kucuk_ay.equals("mayıs")) && (30 >= gun && gun >= 22)) || ((kucuk_ay.equals("haziran")) && (22 >= gun && gun >= 1))){
            System.out.print("İkizler Burcusun");
        }
        if (((kucuk_ay.equals("haziran")) && (30 >= gun && gun >= 23)) || ((kucuk_ay.equals("temmuz")) && (22 >= gun && gun >= 1))){
            System.out.print("Yengeç Burcusun");
        }
        if (((kucuk_ay.equals("temmuz")) && (30 >= gun && gun >= 23)) || ((kucuk_ay.equals("ağustos")) && (22 >= gun && gun >= 1))){
            System.out.print("Aslan Burcusun");
        }
        if (((kucuk_ay.equals("ağustos")) && (30 >= gun && gun >= 23)) || ((kucuk_ay.equals("eylül")) && (22 >= gun && gun >= 1))){
            System.out.print("Başak Burcusun");
        }
        if (((kucuk_ay.equals("eylül")) && (30 >= gun && gun >= 23)) || ((kucuk_ay.equals("ekim")) && (22 >= gun && gun >= 1))){
            System.out.print("Terazi Burcusun");
        }
        if (((kucuk_ay.equals("ekim")) && (30 >= gun && gun >= 23)) || ((kucuk_ay.equals("kasım")) && (21 >= gun && gun >= 1))){
            System.out.print("Akrep Burcusun");
        }
        if (((kucuk_ay.equals("kasım")) && (30 >= gun && gun >= 22)) || ((kucuk_ay.equals("aralık")) && (21 >= gun && gun >= 1))){
            System.out.print("Yay Burcusun");
        }
        if (((kucuk_ay.equals("aralık")) && (30 >= gun && gun >= 22)) || ((kucuk_ay.equals("ocak")) && (21 >= gun && gun >= 1))){
            System.out.print("Oğlak Burcusun");
        }
        if (((kucuk_ay.equals("ocak")) && (30 >= gun && gun >= 22)) || ((kucuk_ay.equals("şubat")) && (19 >= gun && gun >= 1))){
            System.out.print("Kova Burcusun");
        }
        if (((kucuk_ay.equals("şubat")) && (30 >= gun && gun >= 20)) || ((kucuk_ay.equals("mart")) && (20 >= gun && gun >= 1))){
            System.out.print("Balık Burcusun");
        }
    }
}
