import java.util.Scanner;

public class hobi {
    public static void main(String[] args) {
        int hava;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava durumunu giriniz");
        hava = input.nextInt();

        if(hava < 5){
            System.out.print("Kayak Yapmalısın");
        }
        else if (hava > 5 && hava < 15){
            System.out.print("Sinemaya Gitmelisin");
        } else if (hava >15 && hava < 25) {
            System.out.print("Piknik Yapmalısın");
        } else if (hava > 25) {
            System.out.print("Yümeye Gitmelisin");
        }
    }
}
